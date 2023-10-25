@main def Newton_Raphson(): Unit =
  def f(x: Double) = {
    val value = (10 * math.pow(x, 5)) + (-5)
    value
  }

  def f_prime(x: Double) = {
    val value = 50 * math.pow(x, 4)
    value
  }

  var x0 = 5.0
  var x1 = 0

  def iseq(n1: Double, n2: Double): Boolean = {
    n1 - n2 < 0.00001
  }

  while (!iseq(f(x0), 0)) {
    x0 = x0 - (f(x0) / f_prime(x0))
  }
  println(x0)
  println(f(x0))
