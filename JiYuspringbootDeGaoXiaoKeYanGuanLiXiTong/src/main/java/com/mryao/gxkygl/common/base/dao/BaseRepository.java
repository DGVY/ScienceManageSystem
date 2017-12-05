package com.mryao.gxkygl.common.base.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/15 21:21
 * @Description: 基础dao
 * @Version: 1.0
 */
@NoRepositoryBean
public interface BaseRepository<T> extends JpaRepository<T, Serializable>,JpaSpecificationExecutor<T> {

}
