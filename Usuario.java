public class Usuario
{

	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;

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

	} fin metodo establecerSegundoNombre



} // Fin clase Usuario