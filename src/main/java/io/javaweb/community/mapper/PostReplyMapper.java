package io.javaweb.community.mapper;

import org.springframework.stereotype.Repository;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;

import io.javaweb.community.common.BaseMapper;
import io.javaweb.community.entity.PostReplyEntity;
import io.javaweb.community.entity.dto.PostReplyDTO;


@Repository
public interface PostReplyMapper extends BaseMapper<PostReplyEntity>{

	//根据帖子id,检索帖子回复信息
	PageList<PostReplyDTO> queryReplysByPostId(PostReplyDTO postReplyDTO, PageBounds pageBounds)throws Exception;

	//根据帖子id,检索帖子回复数量
	Integer queryReplyCountByPostId(String postId)throws Exception;

}
