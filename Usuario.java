public class Usuario
{

	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;

	public Usuario( String pNombre, String sNombre, String pApellido,
		String sApellido )
	{

		primerNombre = pNombre;
		segundoNombre = sNombre;
		primerApellido = pApellido;
		segundoApellido = sApellido;

	} // Fin metodo constructor

	public String obtenerPrimerNombre()
	{
	
		return primerNombre;

	} // Fin obtenerPrimerNombre

	public String obtenerSegundoNombre()
	{

		return segundoNombre;

	} // Fin obtenerSegundoNombre

	public String obtenerPrimerApellido()
	{

		return primerApellido;

	} // Fin obtenerPrimerApellido

	public String obtenerSegundoApellido()
	{

		return segundoApellido;

	} // Fin obtenerSegundoApellido

	public void establecerPrimerNombre( String fName )
	{

		primerNombre = fName;

	} // Fin establecerPrimerNombre

	public void establecerSegundoNombre( String secName )
	{

		segundoNombre = secName;

	} // fin metodo establecerSegundoNombre

	public void establecerPrimerApellido( String fLastName )
	{

		primerApellido = fLastName;

	} // Fin establecerPrimerApellido

	public void establecerSegundoApellido( String segApellido )
	{

		segundoApellido = segApellido;

	} // Fin del metodo establecerSegundoApellido



} // Fin clase Usuario