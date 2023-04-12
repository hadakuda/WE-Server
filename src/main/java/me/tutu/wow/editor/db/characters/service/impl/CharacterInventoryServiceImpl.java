package me.tutu.wow.editor.db.characters.service.impl;

import me.tutu.wow.editor.db.characters.model.CharacterInventory;
import me.tutu.wow.editor.db.characters.mapper.CharacterInventoryMapper;
import me.tutu.wow.editor.db.characters.service.CharacterInventoryService;
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
@Service
public class CharacterInventoryServiceImpl extends ServiceImpl<CharacterInventoryMapper, CharacterInventory> implements CharacterInventoryService {

}
