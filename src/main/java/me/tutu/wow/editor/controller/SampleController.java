package me.tutu.wow.editor.controller;

import lombok.extern.slf4j.Slf4j;
import me.tutu.wow.editor.db.auth.model.Account;
import me.tutu.wow.editor.db.characters.model.Characters;
import me.tutu.wow.editor.service.SampleSvc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/test")
public class SampleController {
    @Resource
    private SampleSvc sampleSvc;

    @GetMapping("/accounts")
    public List<Account> getAccounts() {
        return sampleSvc.getAccounts();
    }

    @GetMapping("/chars")
    public List<Characters> getAccounts(int account) {
        return sampleSvc.getCharacters(account);
    }
}
