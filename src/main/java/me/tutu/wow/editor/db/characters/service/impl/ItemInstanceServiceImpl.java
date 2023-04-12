package me.tutu.wow.editor.db.characters.service.impl;

import me.tutu.wow.editor.db.characters.model.ItemInstance;
import me.tutu.wow.editor.db.characters.mapper.ItemInstanceMapper;
import me.tutu.wow.editor.db.characters.service.ItemInstanceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * Item System 服务实现类
 * </p>
 *
 * @author tutu
 * @since 2023-04-12
 */
@Service
public class ItemInstanceServiceImpl extends ServiceImpl<ItemInstanceMapper, ItemInstance> implements ItemInstanceService {

}
