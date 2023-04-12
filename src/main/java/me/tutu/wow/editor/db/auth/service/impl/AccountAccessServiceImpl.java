package me.tutu.wow.editor.db.auth.service.impl;

import me.tutu.wow.editor.db.auth.model.AccountAccess;
import me.tutu.wow.editor.db.auth.mapper.AccountAccessMapper;
import me.tutu.wow.editor.db.auth.service.AccountAccessService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tutu
 * @since 2023-04-12
 */
@Service
public class AccountAccessServiceImpl extends ServiceImpl<AccountAccessMapper, AccountAccess> implements AccountAccessService {

}
