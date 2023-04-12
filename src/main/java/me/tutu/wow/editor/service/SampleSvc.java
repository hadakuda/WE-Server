package me.tutu.wow.editor.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import me.tutu.wow.editor.annotations.DataSource;
import me.tutu.wow.editor.db.auth.model.Account;
import me.tutu.wow.editor.db.auth.service.AccountService;
import me.tutu.wow.editor.db.characters.model.Characters;
import me.tutu.wow.editor.db.characters.service.CharactersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SampleSvc {
    @Resource
    private AccountService accountService;

    @Resource
    private CharactersService charactersService;

    @DataSource(name = "auth")
    public List<Account> getAccounts() {
        return accountService.list();
    }

    @DataSource(name = "characters")
    public List<Characters> getCharacters(int accountId) {
        QueryWrapper<Characters> qw = new QueryWrapper<>();
        qw.lambda().eq(Characters::getAccount, accountId);
        return charactersService.list(qw);
    }
}
