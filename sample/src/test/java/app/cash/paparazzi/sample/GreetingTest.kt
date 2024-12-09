package app.cash.paparazzi.sample

import app.cash.paparazzi.Paparazzi
import com.example.app.Greeting
import org.junit.Rule
import org.junit.Test

class GreetingTest {
  @get:Rule
  var paparazzi = Paparazzi()

  @Test
  fun hello() {
    paparazzi.snapshot { Greeting() }
  }
}
