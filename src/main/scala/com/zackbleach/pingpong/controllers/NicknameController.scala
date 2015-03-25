package com.zackbleach.pingpong.controllers

import org.scalatra._
import scalate.ScalateSupport
import com.zackbleach.pingpong.controllers.traits._
import com.zackbleach.pingpong.services._

class NicknameController extends JsonController {

  get("/?"){
    Nickname(NicknameService.getNickName())
  }

}

case class Nickname(nickname: String)
