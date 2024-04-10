package es.albarregas.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author javier
 */
@WebServlet(name = "PrimerControlador", urlPatterns = {"/PrimerControlador"})
public class PrimerControlador extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html lang='es'>");
            out.println("<head>");
            out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            out.println("<link href='https://cdn.jsdelivr.net/npm/daisyui@4.10.1/dist/full.min.css' rel='stylesheet' type='text/css'/>");
            out.println("<script src='https://cdn.tailwindcss.com'></script>");
            out.println("<title>Servlet PrimerControlador</title>");
            out.println("</head>");

            String operador1 = request.getParameter("param1");
            String operador2 = request.getParameter("param2");
            int resultado = (Integer.parseInt(operador1)) + (Integer.parseInt(operador2));

            out.println("<body class='bg-green-200'>");
            out.println("<div class='flex justify-center items-center'>");
            out.println("    <div>");
            out.println("            <h1 class='text-3xl text-orange-800 font-black'>Servlet PrimerControlador está en el contexto" + request.getContextPath() + "</h1>");
            out.println("   </div>");
            out.println("</div>");
            out.println("<div class='flex justify-center items-center'>");
            out.println("    <div>");
            out.println("            <h2 class='text-2xl text-orange-700 font-black'>Método: " + request.getMethod() + "</h2>");
            out.println("   </div>");
            out.println("</div>");
            out.println("<div class='flex justify-center items-center p-5'>");
            out.println("    <div class='bg-green-100 border-double border-4 border-orange-500 p-5'>");
            out.println("        <h2>Accept: " + request.getHeader("Accept") + "</h2>");
            out.println("        <h2>Servidor:  " + request.getServerName() + " , " + request.getSession().toString() + "</h2>");
            out.println("        <h2>Set-Cookie: JSESSIONID=" + request.getSession().getId() + "</h2>");
            out.println("        <h2>User-Agent: " + request.getHeader("User-Agent") + "</h2>");
            out.println("        <h2>Ruta del contexto: " + request.getRequestURI() + "</h2>");
            out.println("        <h2>Encoding: " + request.getHeader("Accept-Encoding") + "</h2>");
            out.println("        <h2>Lenguaje: " + request.getHeader("Accept-Language") + "</h2>");
            out.println("        <h2>HOST: " + request.getHeader("host") + "</h2>");
            out.println("        <h2>Connection: " + request.getHeader("Connection") + "</h2>");
            out.println("    </div>");
            out.println("</div>");

            out.println("<div class='flex justify-center items-center p-5'>");
            out.println("    <div class='bg-green-100 border-double border-4 border-orange-500 p-5'>");
            out.println("        <h1 class='text-2xl text-orange-700 font-black'> Suma con parámetros</h1>");
            out.println("        <h3 class='text-2xl text-orange-700 font-black'> El resultado de los operadores " + operador1 + " más " + operador2 + " = " + resultado + "</h3>");
            out.println("    </div>");
            out.println("</div>");

            out.println("<div class='flex justify-center items-center'>");
            out.println("       <button type='submit' class='size-20 bg-yellow-500 text-white rounded-md hover:bg-yellow-600'><a href=\"JSP/llamadasControlador.jsp\">Volver</a></button>");
            out.println("</div>");

            out.println("<footer class='footer items-center p-4 bg-green-100 text-orange-600 mt-28'>");
            out.println("<aside class='items-center grid-flow-col'>");
            out.println("<svg width='36' height='36' viewBox='0 0 24 24' xmlns='http://www.w3.org/2000/svg' fill-rule='evenodd' clip-rule='evenodd' class='fill-current'><path d='M22.672 15.226l-2.432.811.841 2.515c.33 1.019-.209 2.127-1.23 2.456-1.15.325-2.148-.321-2.463-1.226l-.84-2.518-5.013 1.677.84 2.517c.391 1.203-.434 2.542-1.831 2.542-.88 0-1.601-.564-1.86-1.314l-.842-2.516-2.431.809c-1.135.328-2.145-.317-2.463-1.229-.329-1.018.211-2.127 1.231-2.456l2.432-.809-1.621-4.823-2.432.808c-1.355.384-2.558-.59-2.558-1.839 0-.817.509-1.582 1.327-1.846l2.433-.809-.842-2.515c-.33-1.02.211-2.129 1.232-2.458 1.02-.329 2.13.209 2.461 1.229l.842 2.515 5.011-1.677-.839-2.517c-.403-1.238.484-2.553 1.843-2.553.819 0 1.585.509 1.85 1.326l.841 2.517 2.431-.81c1.02-.33 2.131.211 2.461 1.229.332 1.018-.21 2.126-1.23 2.456l-2.433.809 1.622 4.823 2.433-.809c1.242-.401 2.557.484 2.557 1.838 0 .819-.51 1.583-1.328 1.847m-8.992-6.428l-5.01 1.675 1.619 4.828 5.011-1.674-1.62-4.829z'></path></svg>");
            out.println("<p>Copyright © 2024 - All right reserved - javierprogrameitor</p>");
            out.println("</aside>");
            out.println("<nav class='grid-flow-col gap-4 md:place-self-center md:justify-self-end'>");
            out.println("<a><svg xmlns='http://www.w3.org/2000/svg' width='24' height='24' viewBox='0 0 24 24' class='fill-current'><path d='M24 4.557c-.883.392-1.832.656-2.828.775 1.017-.609 1.798-1.574 2.165-2.724-.951.564-2.005.974-3.127 1.195-.897-.957-2.178-1.555-3.594-1.555-3.179 0-5.515 2.966-4.797 6.045-4.091-.205-7.719-2.165-10.148-5.144-1.29 2.213-.669 5.108 1.523 6.574-.806-.026-1.566-.247-2.229-.616-.054 2.281 1.581 4.415 3.949 4.89-.693.188-1.452.232-2.224.084.626 1.956 2.444 3.379 4.6 3.419-2.07 1.623-4.678 2.348-7.29 2.04 2.179 1.397 4.768 2.212 7.548 2.212 9.142 0 14.307-7.721 13.995-14.646.962-.695 1.797-1.562 2.457-2.549z'></path></svg>");
            out.println("   </a> ");
            out.println("   <a><svg xmlns='http://www.w3.org/2000/svg' width='24' height='24' viewBox='0 0 24 24' class='fill-current'><path d='M19.615 3.184c-3.604-.246-11.631-.245-15.23 0-3.897.266-4.356 2.62-4.385 8.816.029 6.185.484 8.549 4.385 8.816 3.6.245 11.626.246 15.23 0 3.897-.266 4.356-2.62 4.385-8.816-.029-6.185-.484-8.549-4.385-8.816zm-10.615 12.816v-8l8 3.993-8 4.007z'></path></svg></a>");
            out.println("   <a><svg xmlns='http://www.w3.org/2000/svg' width='24' height='24' viewBox='0 0 24 24' class='fill-current'><path d='M9 8h-3v4h3v12h5v-12h3.642l.358-4h-4v-1.667c0-.955.192-1.333 1.115-1.333h2.885v-5h-3.808c-3.596 0-5.192 1.583-5.192 4.615v3.385z'></path></svg></a>");
            out.println("</nav>");
            out.println("</footer>");

            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html lang='es'>");
            out.println("<head>");
            out.println("<title>Servlet PrimerControlador</title>");
            out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            out.println("<link href='https://cdn.jsdelivr.net/npm/daisyui@4.10.1/dist/full.min.css' rel='stylesheet' type='text/css'/>");
            out.println("<script src='https://cdn.tailwindcss.com'></script>");
            out.println("<title>Servlet PrimerControlador</title>");
            out.println("</head>");

            String dni = request.getParameter("dni");
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String telefono = request.getParameter("telefono");

            out.println("<body class='bg-green-200'>");
            out.println("<div class='flex justify-center items-center'>");
            out.println("    <div>");
            out.println("            <h1 class='text-3xl text-orange-800 font-black'>Servlet PrimerControlador está en el contexto" + request.getContextPath() + "</h1>");
            out.println("   </div>");
            out.println("</div>");
            out.println("<div class='flex justify-center items-center'>");
            out.println("    <div>");
            out.println("            <h2 class='text-2xl text-orange-700 font-black'>Método: " + request.getMethod() + "</h2>");
            out.println("   </div>");
            out.println("</div>");
            out.println("<div class='flex justify-center items-center p-5'>");
            out.println("    <div class='bg-green-100 border-double border-4 border-orange-500 p-5'>");
            out.println("        <h2>Accept: " + request.getHeader("Accept") + "</h2>");
            out.println("        <h2>Servidor:  " + request.getServerName() + " , " + request.getSession().toString() + "</h2>");
            out.println("        <h2>Set-Cookie: JSESSIONID=" + request.getSession().getId() + "</h2>");
            out.println("        <h2>User-Agent: " + request.getHeader("User-Agent") + "</h2>");
            out.println("        <h2>Ruta del contexto: " + request.getRequestURI() + "</h2>");
            out.println("        <h2>Encoding: " + request.getHeader("Accept-Encoding") + "</h2>");
            out.println("        <h2>Lenguaje: " + request.getHeader("Accept-Language") + "</h2>");
            out.println("        <h2>HOST: " + request.getHeader("host") + "</h2>");
            out.println("        <h2>Connection: " + request.getHeader("Connection") + "</h2>");
            out.println("    </div>");
            out.println("</div>");

            out.println("<div class='flex justify-center items-center p-5'>");
            out.println("    <div class='bg-green-100 border-double border-4 border-orange-500 p-5'>");
            out.println("<h3 class='text-2xl text-orange-700 font-black'> Dni: " + dni + "</h3>");
            out.println("<h3 class='text-2xl text-orange-700 font-black'> Nombre: " + nombre + "</h3>");
            out.println("<h3 class='text-2xl text-orange-700 font-black'> Apellido: " + apellido + "</h3>");
            out.println("<h3 class='text-2xl text-orange-700 font-black'> Teléfono: " + telefono + "</h3>");
            out.println("    </div>");
            out.println("</div>");

            out.println("</div>");
            out.println("   <div class='flex justify-center items-center'>");
            out.println("       <button type='submit' class='size-20 bg-yellow-500 text-white rounded-md hover:bg-yellow-600'><a href=\"JSP/llamadasControlador.jsp\">Volver</a></button>");
            out.println("</div>");

            out.println("<footer class='footer items-center p-4 bg-green-100 text-orange-600 mt-10'>");
            out.println("<aside class='items-center grid-flow-col'>");
            out.println("<svg width='36' height='36' viewBox='0 0 24 24' xmlns='http://www.w3.org/2000/svg' fill-rule='evenodd' clip-rule='evenodd' class='fill-current'><path d='M22.672 15.226l-2.432.811.841 2.515c.33 1.019-.209 2.127-1.23 2.456-1.15.325-2.148-.321-2.463-1.226l-.84-2.518-5.013 1.677.84 2.517c.391 1.203-.434 2.542-1.831 2.542-.88 0-1.601-.564-1.86-1.314l-.842-2.516-2.431.809c-1.135.328-2.145-.317-2.463-1.229-.329-1.018.211-2.127 1.231-2.456l2.432-.809-1.621-4.823-2.432.808c-1.355.384-2.558-.59-2.558-1.839 0-.817.509-1.582 1.327-1.846l2.433-.809-.842-2.515c-.33-1.02.211-2.129 1.232-2.458 1.02-.329 2.13.209 2.461 1.229l.842 2.515 5.011-1.677-.839-2.517c-.403-1.238.484-2.553 1.843-2.553.819 0 1.585.509 1.85 1.326l.841 2.517 2.431-.81c1.02-.33 2.131.211 2.461 1.229.332 1.018-.21 2.126-1.23 2.456l-2.433.809 1.622 4.823 2.433-.809c1.242-.401 2.557.484 2.557 1.838 0 .819-.51 1.583-1.328 1.847m-8.992-6.428l-5.01 1.675 1.619 4.828 5.011-1.674-1.62-4.829z'></path></svg>");
            out.println("<p>Copyright © 2024 - All right reserved - javierprogrameitor</p>");
            out.println("</aside>");
            out.println("<nav class='grid-flow-col gap-4 md:place-self-center md:justify-self-end'>");
            out.println("<a><svg xmlns='http://www.w3.org/2000/svg' width='24' height='24' viewBox='0 0 24 24' class='fill-current'><path d='M24 4.557c-.883.392-1.832.656-2.828.775 1.017-.609 1.798-1.574 2.165-2.724-.951.564-2.005.974-3.127 1.195-.897-.957-2.178-1.555-3.594-1.555-3.179 0-5.515 2.966-4.797 6.045-4.091-.205-7.719-2.165-10.148-5.144-1.29 2.213-.669 5.108 1.523 6.574-.806-.026-1.566-.247-2.229-.616-.054 2.281 1.581 4.415 3.949 4.89-.693.188-1.452.232-2.224.084.626 1.956 2.444 3.379 4.6 3.419-2.07 1.623-4.678 2.348-7.29 2.04 2.179 1.397 4.768 2.212 7.548 2.212 9.142 0 14.307-7.721 13.995-14.646.962-.695 1.797-1.562 2.457-2.549z'></path></svg>");
            out.println("   </a> ");
            out.println("   <a><svg xmlns='http://www.w3.org/2000/svg' width='24' height='24' viewBox='0 0 24 24' class='fill-current'><path d='M19.615 3.184c-3.604-.246-11.631-.245-15.23 0-3.897.266-4.356 2.62-4.385 8.816.029 6.185.484 8.549 4.385 8.816 3.6.245 11.626.246 15.23 0 3.897-.266 4.356-2.62 4.385-8.816-.029-6.185-.484-8.549-4.385-8.816zm-10.615 12.816v-8l8 3.993-8 4.007z'></path></svg></a>");
            out.println("   <a><svg xmlns='http://www.w3.org/2000/svg' width='24' height='24' viewBox='0 0 24 24' class='fill-current'><path d='M9 8h-3v4h3v12h5v-12h3.642l.358-4h-4v-1.667c0-.955.192-1.333 1.115-1.333h2.885v-5h-3.808c-3.596 0-5.192 1.583-5.192 4.615v3.385z'></path></svg></a>");
            out.println("</nav>");
            out.println("</footer>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
