/*
Copyright © 2014 by eBusiness Information
All rights reserved. This source code or any portion thereof
may not be reproduced or used in any manner whatsoever
without the express written permission of eBusiness Information.
*/
package mobi.designmyapp.common.engine.builder;


import mobi.designmyapp.common.engine.model.Template;

/**
 * Builder generic interface to build a specific template,
 * the interface provides a type.
 * Created by loic on 7/7/14.
 */
public interface Builder<T extends Template> {

  void build(T template);

  Type getType();

  public static enum Type {
    ANDROID,IOS,WEBAPP
  }
}
