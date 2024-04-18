<%@page import="java.util.ArrayList"%>
<%@page import="java.net.URLEncoder"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="es">
    <head>
        <title>Control de Cookies</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/daisyui@4.10.1/dist/full.min.css" rel="stylesheet" type="text/css" />
        <script src="https://cdn.tailwindcss.com"></script>
    </head>
    <body class="bg-green-100">
        <%
            // Obtener el valor del botón enviado desde el formulario
            String action = request.getParameter("enviar");

            if (action != null) {
                if (action.equals("crear")) {
                    // Verificar si se han proporcionado los datos necesarios
                    String nombreCookie = request.getParameter("Nombre");
                    String valorCookie = request.getParameter("Valor");
                    // Si falta algún dato, redireccionar con un mensaje de error
                    if (nombreCookie == null || valorCookie == null || nombreCookie.isEmpty() || valorCookie.isEmpty()) {
                        response.sendRedirect("CookiesCompletas.jsp?mensaje=" + URLEncoder.encode("¡Por favor, introduzca el nombre y el valor de la cookie!", "UTF-8"));

                    } else {
                        // Lógica para crear la cookie

                        Cookie cookie = new Cookie(nombreCookie, URLEncoder.encode(valorCookie, "UTF-8"));
                        response.addCookie(cookie);
                        response.sendRedirect("CookiesCompletas.jsp?mensaje=" + URLEncoder.encode("¡Cookie creada exitosamente!", "UTF-8"));
                    }

                } else if (action.equals("visualizar")) {
                    // Lógica para visualizar todas las cookies
                    Cookie[] cookies = request.getCookies();
                    // Construir una lista de pares nombre-valor de cookies para mostrar en la página CookiesCompletas.jsp
                    ArrayList<String> listaCookies = new ArrayList<>();
                    if (cookies != null) {
                        for (Cookie cookie : cookies) {
                            listaCookies.add(cookie.getName() + ": " + cookie.getValue());
                        }
                    }
                    request.setAttribute("cookies", listaCookies);
                    request.getRequestDispatcher("CookiesCompletas.jsp").forward(request, response);

                } else if (action.equals("modificar")) {
                    //Variables para modificar las cookies
                    String modificaCookie = request.getParameter("nombreCookieAModificar");
                    String modificaValorCookie = request.getParameter("valorCookieAModificar");

                    Cookie[] cookies = request.getCookies();
                    if (cookies != null) {
                        for (Cookie cookie : cookies) {
                            if (cookie.getName().equals(modificaCookie)) {
                                // Modificar el valor de la cookie
                                cookie.setValue(modificaValorCookie);
                                // Agregar la cookie modificada a la respuesta
                                response.addCookie(cookie);
                                // Redireccionar a alguna página o mostrar un mensaje de éxito
                                response.sendRedirect("CookiesCompletas.jsp?mensaje=" + URLEncoder.encode("¡Cookie modificada exitosamente!", "UTF-8"));
                                return; // Terminar la ejecución del código para evitar redirecciones duplicadas
                            }
                        }
                    }

                    // Si no se encontró la cookie para modificar, redireccionar con un mensaje de error
                    response.sendRedirect("CookiesCompletas.jsp?mensaje=" + URLEncoder.encode("La cookie que intenta modificar no existe.", "UTF-8"));

                } else if (action.equals("eliminar")) {

                    String nombreCookieAEliminar = request.getParameter("nombreCookieAEliminar");

                    // Obtener todas las cookies enviadas por el cliente
                    Cookie[] cookies = request.getCookies();
                    if (cookies != null) {
                        for (Cookie cookie : cookies) {
                            //Obtiene el nombre de la cookie a eliminar
                            if (cookie.getName().equals(nombreCookieAEliminar)) {
                                // Establecer el tiempo de vida de la cookie a 0 para eliminarla
                                cookie.setMaxAge(0);
                                // Agregar la cookie modificada a la respuesta
                                response.addCookie(cookie);
                                // Redireccionar a alguna página o mostrar un mensaje de éxito
                                response.sendRedirect("CookiesCompletas.jsp?mensaje=" + URLEncoder.encode("¡Cookie eliminada exitosamente!", "UTF-8"));
                                return; // Terminar la ejecución del código para evitar redirecciones duplicadas
                            }
                        }
                    }

                    // Si no se encontró la cookie para eliminar, redireccionar con un mensaje de error
                    response.sendRedirect("CookiesCompletas.jsp?mensaje=" + URLEncoder.encode("La cookie que intenta eliminar no existe.", "UTF-8"));

                } else if (action.equals("menu")) {
                    // Redireccionar al menú principal u otra página según sea necesario
                    response.sendRedirect("../index.html");
                }
            }
        %>

    </body>
</html>
