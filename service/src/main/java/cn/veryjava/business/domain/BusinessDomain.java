package cn.veryjava.business.domain;

import java.io.Serializable;

/**
 * 描述: TODO:
 * 包名: cn.veryjava.business.domain.
 * 作者: barton.
 * 日期: 16-12-3.
 * 项目名称: bussiness
 * 版本: 1.0
 * JDK: since 1.8
 */
public class BusinessDomain implements Serializable{

  private int id;

  private String name;

  public BusinessDomain(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
