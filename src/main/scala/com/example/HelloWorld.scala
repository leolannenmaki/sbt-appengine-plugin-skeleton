package com.example;

import javax.servlet.http.{HttpServlet, HttpServletRequest, HttpServletResponse}

class HelloWorld extends HttpServlet {
  override def doGet(request: HttpServletRequest, response: HttpServletResponse) {
    response.setContentType("text/plain")
    response.getWriter.println("Hello, world")
  }
}
