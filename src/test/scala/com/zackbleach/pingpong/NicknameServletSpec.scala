package com.zackbleach.pingpong

import org.scalatra.test.specs2._
import com.zackbleach.pingpong.controllers._

// For more on Specs2, see http://etorreborre.github.com/specs2/guide/org.specs2.guide.QuickStart.html
class NicknameServletSpec extends ScalatraSpec { def is =
  "GET / on NicknameServlet"                     ^
    "should return status 200"                  ! root200^
                                                end

  addServlet(classOf[NicknameController], "/*")

  def root200 = get("/") {
    status must_== 200
  }
}
