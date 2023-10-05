/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

//import jakarta.servlet.annotation.WebServlet;
import Clases.Alumno;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author cliente
 */
@WebServlet(urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {
    Alumno alumno;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter respuesta = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            alumno=new Alumno();
            respuesta.println("<!DOCTYPE html>");
            respuesta.println("<html>");
            respuesta.println("<head>");
            respuesta.println("<title>Servlet NewServlet</title>");            
            respuesta.println("</head>");
            respuesta.println("<body>");
            //respuesta.println("<h1>Mi primer Servlet " + request.getContextPath() + "</h1>");
            //respuesta.println("<h1>Segunto Título" + alumno.getNombre() + "</h1>");
            //respuesta.println("<h2>Tercer Título</h2>");
            respuesta.println("<body>\n" +
"  <header id=\"Inicio\">\n" +
"    <h1 style=\"text-align:center;\" >GUATEMUSICA</h1>\n" +
"    <img class=\"logo\" src=\"https://yt3.googleusercontent.com/ytc/APkrFKabLD4RvsxlTzEQqzF8EXocxK0bejtNoATlVWKwhw=s900-c-k-c0x00ffffff-no-rj\" alt=\"Logo compañia\"/>\n" +
"  </header>\n" +
"  <nav>\n" +
"    <a href=\"#Inicio\" class=\"Ancla\">Inicio</a>\n" +
"    <a href=\"#Destinos\" class=\"Ancla\">Destino</a>\n" +
"    <a href=\"#Nosotros\" class=\"Ancla\">Nosotros</a>\n" +
"    <a href=\"#registro\" class=\"Ancla\">Registro</a>\n" +
"  </nav>\n" +
"  <section class=\"section1\">\n" +
"    <div class=\"presentacion\">\n" +
"      <h3>Has llegado a la mejor tienda de instrumentos musicales de Guatemala</h3>\n" +
"      <p>¡Explora el mundo con nosotros!</p>\n" +
"      <p>\n" +
"              \n" +
"      </p>\n" +
"    </div>\n" +
"  </section>\n" +
"<h2>Principales Instrumentos</h2>\n" +
"  <section class=\"container \" id=\"Destinos\">\n" +
"\n" +
"    <div class=\"columna\">\n" +
"      <h4>Nord Stage 3 </h4>\n" +
"      <p class=\"precio\">$4500</p>\n" +
"      <hr>\n" +
"      <img src=\"https://i.ytimg.com/vi/PWSc8TCsd0o/maxresdefault.jpg\" alt=\"\" class=\"paris\">\n" +
"      <hr>\n" +
"      <a href=\"#\" class=\"button\">Adquirir</a>\n" +
"    </div>\n" +
"\n" +
"    <div class=\"columna\">\n" +
"      <h4>Trompeta Yamaha</h4>\n" +
"      <p class=\"precio\">$500</p>\n" +
"      <hr>\n" +
"      <img src=\"https://hotsoundsstore.com/images/virtuemart/product/RBC30403-L.jpg\" alt=\"\">\n" +
"      <hr>\n" +
"      <a href=\"#\" class=\"button\">Adquirir</a>\n" +
"    </div>\n" +
"    <div class=\"columna\">\n" +
"      <h4>Batería DW</h4>\n" +
"      <p class=\"precio\">$1500</p>\n" +
"      <hr>\n" +
"      <img src=\"https://www.casainstrumental.com/wp-content/uploads/2020/07/DDLM2215BL-1.jpg\" alt=\"\">\n" +
"      <hr>\n" +
"      <a href=\"#\" class=\"button\">Adquirir</a>\n" +
"    </div>\n" +
"    <div class=\"columna\">\n" +
"      <h4>Bajo Fender</h4>\n" +
"      <p class=\"precio\">$2000</p>\n" +
"      <hr>\n" +
"      <p>\n" +
"        \n" +
"      </p>\n" +
"      <img class=\"img2\" src=\"https://www.domisolmusic.com/wp-content/uploads/2020/09/11-a-1.jpg\" alt=\"\" />\n" +
"      <hr>\n" +
"      <a href=\"#\" class=\"button\">Adquirir</a>\n" +
"    </div>\n" +
"    <div class=\"columna\">\n" +
"      <h4>Guitarra Gretsh</h4>\n" +
"      <p class=\"precio\">$500</p>\n" +
"      <hr>\n" +
"     <br>\n" +
"      <img class=\"img1\" src=\"https://musicalcedar.com/wp-content/uploads/2021/12/GRETSCH-G2410TG-Musical-Cedar.png\" alt=\"\" />\n" +
"      <hr>\n" +
"      <a href=\"#\" class=\"button\">Adquirir</a>\n" +
"\n" +
"  </section>\n" +
"  <section id=\"Nosotros\" class=\"Nosotros\">\n" +
"  <div class=\"divnosotros\">\n" +
"<h2>Sobre Nosotros</h2>\n" +
"<p>En Guatemusica nos comprometemos en brindarte el mejor servicio de venta de todo tipo de instrumentos musicales.</p>\n" +
"\n" +
"<h2>Nuestra Horario</h2>\n" +
"<p>Manejamos un horario flexible para que tú puedas venir a la hora que prefieras.</p>\n" +
"\n" +
"  <h2></h2>\n" +
"  <p></p></div>\n" +
"    <div class=\"divnosotros2\">\n" +
"\n" +
"    </div>\n" +
"  </section>\n" +
"  <section class=\"Form\" id=\"registro\">\n" +
"    \n" +
"    <form action=\"\" class=\"formulario\">\n" +
"      <h2>Registro</h2>\n" +
"      <input type=\"text\" name=\"\" id=\"\" placeholder=\"Nombre Completo\" />\n" +
"      <input type=\"email\" name=\"\" id=\"\" placeholder=\"Correo electronico\" />\n" +
"      <input type=\"password\" name=\"\" id=\"\" placeholder=\"Contraseña\" />\n" +
"      <input type=\"button\" value=\"Registrarse\" class=\"btn\"/>\n" +
"    </form>\n" +
"  </section>\n" +
"  <footer>\n" +
"    <p>Creado en 2023 por \"DWHD\"</p>\n" +
"  </footer> ");
            respuesta.println("</body>");
            respuesta.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        processRequest(request, response);
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
        processRequest(request, response);
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
