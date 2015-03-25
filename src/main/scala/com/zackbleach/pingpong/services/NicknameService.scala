package com.zackbleach.pingpong.services

import scala.io.Source
import scala.util.Random

object NicknameService {
  
  private val pingpong = readLinesFromResource("/pingpong.txt")
  private val kungfu = readLinesFromResource("/kungfu.txt")

  def getNickName(): String = {
    val first = getRandomElement(kungfu)
    val last = getRandomElement(pingpong)
 
      first + " " + last
  }

  private def getRandomElement(list: Seq[String]): String = { 
    val random = new Random
    list(random.nextInt(list.length))
  }

  private def readLinesFromResource(path: String) = {
    Source.fromURL(getClass().getResource(path)).getLines.toList
  }
}
