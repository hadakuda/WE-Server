package me.tutu.wow.editor.db.auth.service.impl;

import me.tutu.wow.editor.annotations.DataSource;
import me.tutu.wow.editor.db.auth.model.Account;
import me.tutu.wow.editor.db.auth.mapper.AccountMapper;
import me.tutu.wow.editor.db.auth.service.AccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * Account System 服务实现类
 * </p>
 *
 * @author tutu
 * @since 2023-04-12
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

}
