package org.laolao.cue

import java.io.FileWriter

trait DataGenerator {

  def generate(fw: FileWriter)

  def quote(s: String) = "\"" + s + "\""
}
