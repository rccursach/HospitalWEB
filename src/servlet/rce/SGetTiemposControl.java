package servlet.rce;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servicios.RceStub;
/*
import servicios.RceStub.ObtenerCierre_destino;
import servicios.RceStub.ObtenerCierre_destinoResponse;
import servicios.RceStub.ObtenerTiempo_control;
import servicios.RceStub.ObtenerTiempo_controlResponse;
*/

/**
 * Servlet implementation class SGetTiemposControl
 */
public class SGetTiemposControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SGetTiemposControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RceStub rce = new RceStub();
		/*
		ObtenerTiempo_control stGetTiemposControl = new ObtenerTiempo_control();
		ObtenerTiempo_controlResponse res = rce.obtenerTiempo_control(stGetTiemposControl);
		
		response.getWriter().append(res.get_return());
		*/
		response.getWriter().append("[]");
	}

}
