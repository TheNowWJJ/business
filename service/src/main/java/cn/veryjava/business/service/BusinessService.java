package cn.veryjava.business.service;

import cn.veryjava.business.domain.BusinessDomain;

/**
 * 描述:
 * 包名: cn.veryjava.bussiness.service.
 * 作者: barton.
 * 日期: 16-12-3.
 * 项目名称: business
 * 版本: 1.0
 * JDK: since 1.8
 */
public interface BusinessService {
  BusinessDomain findBusiness(int id, String name);
}
