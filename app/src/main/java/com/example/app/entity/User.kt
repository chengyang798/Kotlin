package com.example.app.entity

/**
 * @author  chy
 * @date    2020-04-02
 */
data class User constructor(var username: String?, var password: String?, var code: String?) {

  constructor():this(null,null,null)
}