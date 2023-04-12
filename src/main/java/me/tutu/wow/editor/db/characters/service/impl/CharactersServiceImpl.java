package me.tutu.wow.editor.db.characters.service.impl;

import me.tutu.wow.editor.annotations.DataSource;
import me.tutu.wow.editor.db.characters.model.Characters;
import me.tutu.wow.editor.db.characters.mapper.CharactersMapper;
import me.tutu.wow.editor.db.characters.service.CharactersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * Player System 服务实现类
 * </p>
 *
 * @author tutu
 * @since 2023-04-12
 */
@DataSource(name = "characters")
@Service
public class CharactersServiceImpl extends ServiceImpl<CharactersMapper, Characters> implements CharactersService {

}
