package me.tutu.wow.editor.db.world.service.impl;

import me.tutu.wow.editor.db.world.model.Creature;
import me.tutu.wow.editor.db.world.mapper.CreatureMapper;
import me.tutu.wow.editor.db.world.service.CreatureService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * Creature System 服务实现类
 * </p>
 *
 * @author tutu
 * @since 2023-04-12
 */
@Service
public class CreatureServiceImpl extends ServiceImpl<CreatureMapper, Creature> implements CreatureService {

}
