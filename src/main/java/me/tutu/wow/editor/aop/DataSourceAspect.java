package me.tutu.wow.editor.aop;

import lombok.extern.slf4j.Slf4j;
import me.tutu.wow.editor.annotations.DataSource;
import me.tutu.wow.editor.config.DynamicDataSource;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Slf4j
@Aspect
@Component
public class DataSourceAspect {
    @Pointcut("@annotation(me.tutu.wow.editor.annotations.DataSource)")
    public void dataSourcePointCut() {
    }

    @Around("dataSourcePointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        log.info("switching db...");
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();

        DataSource dataSource = method.getAnnotation(DataSource.class);
        if (dataSource == null) {
            log.info("using default");
            DynamicDataSource.setDataSource("auth");
        } else {
            log.info("using {}", dataSource.name());
            DynamicDataSource.setDataSource(dataSource.name());
        }
        try {
            return point.proceed();
        } finally {
            DynamicDataSource.clearDataSource();
        }
    }
}
