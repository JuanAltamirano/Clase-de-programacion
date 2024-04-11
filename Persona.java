import javax.swing.JOptionPane;

public class Persona {

	private String nombre;
	private long cedula;
	private String email;

	public Persona(String nombre, long cedula, String email) {
		this.nombre = nombre;
		this.cedula = cedula;
		this.email = email;

	}

	@Override
	public String toString() {
		return "El nombre es:" + nombre + "\n" + "la cedula es" + cedula + "\n" + "El email es:" + email + "\n"
				+ "**********************";
	}

	public static void main(String args[]) {

		boolean indicador = true;
		listaSimple<Persona> lista = new listaSimple<Persona>();
		Persona ObjPersona1 = new Persona("carlos", 1192899434, "carlos.torres13@usc.edu.co");
		Persona ObjPersona2 = new Persona("gloria", 1237538, "gloria.castillo00@usc.edu.co");
		Persona ObjPersona3 = new Persona("santiago", 12345675, "santigo.hurtado00@usc.edu.co");
		Persona ObjPersona4 = new Persona("crsitian", 12345675, "cristian.camilo00@usc.edu.co");
		Persona ObjPersona5 = new Persona("maria", 12345675, "maria.carmen00@usc.edu.co");

		do {

			int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero"));
			int contador = 0;

			switch (numero) {
			case 1:
				while(contador!=1) {
				lista.insertarPrimero(ObjPersona1);
				lista.insertarPrimero(ObjPersona2);
				lista.insertarPrimero(ObjPersona3);
				lista.insertarPrimero(ObjPersona4);
				lista.insertarPrimero(ObjPersona5);
				}
				contador=contador+1;
				indicador = true;
				break;

			case 2:
				int buscarCedula = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de la cedula a buscar"));
				if (buscarCedula== ObjPersona1.getCedula()) {
					ObjPersona1.toString();
				} else if (buscarCedula == ObjPersona2.getCedula()) {
					ObjPersona2.toString();
				}

				else if (buscarCedula == ObjPersona3.getCedula()) {
					ObjPersona3.toString();
				} else if (buscarCedula == ObjPersona4.getCedula()) {
					ObjPersona4.toString();
				} else if (buscarCedula == ObjPersona5.getCedula()) {
					ObjPersona5.toString();
				} else {
					JOptionPane.showMessageDialog(null, "No existe");
				}
				indicador = true;
				
				break;
			case 3:
				int cedulaborrar = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de la cedula a borrar"));
				if (cedulaborrar == ObjPersona1.getCedula()) {
					lista.borrar(ObjPersona1);
				} else if (cedulaborrar == ObjPersona2.getCedula()) {
					lista.borrar(ObjPersona2);
				}

				else if (cedulaborrar == ObjPersona3.getCedula()) {
					lista.borrar(ObjPersona3);
				} else if (cedulaborrar == ObjPersona4.getCedula()) {
					lista.borrar(ObjPersona4);
				} else if (cedulaborrar == ObjPersona5.getCedula()) {
					lista.borrar(ObjPersona5);
				} else {
					JOptionPane.showMessageDialog(null, "No existe");
				}

				indicador = true;
				break;

			case 4:
				lista.listar();
				indicador = false;
				break;
			}

		} while (indicador == true);

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getCedula() {
		return cedula;
	}

	public void setCédula(long cédula) {
		this.cedula = cédula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

class Nodo<E> {
	private E elemento;
	private Nodo<E> siguiente;

	public Nodo(E elem, Nodo sig) {
		elemento = elem;
		siguiente = sig;
	}

	public E getElemento() {
		return elemento;
	}

	public Nodo<E> getSig() {
		return siguiente;
	}

	public void setElemento(E elem) {
		elemento = elem;
	}

	public void setSig(Nodo<E> sig) {
		siguiente = sig;
	}
}

class listaSimple<E> {
	private Nodo<E> primero;
	private int numElem;

	public listaSimple() {
		primero = null;
		numElem = 0;
	}

	public void insertarPrimero(E elemento) {
		Nodo nuevo = new Nodo(elemento, primero);
		primero = nuevo;
		numElem++;
	}

	public void insertarFinal(E elemento) {
		Nodo nuevo = new Nodo(elemento, null);
		if (primero == null) {
			primero = nuevo;
		} else {
			Nodo actual = primero;
			while (actual.getSig() != null) {
				actual = actual.getSig();

			}
			actual.setSig(nuevo);
			numElem++;
		}
//System.out.println("Final");
	}

	public void borrar(E elem) {
		if (primero == null)
			System.out.println("lista vacia");
		else if (primero.getElemento() == elem) {
			primero = primero.getSig();
			numElem--;
		} else {
			Nodo actual = primero;
			while (actual.getSig() != null && actual.getSig().getElemento() != elem)
				actual = actual.getSig();
			if (actual.getSig() == null)
				System.out.println("elemento " + elem + " no esta en la lista");
			else {
				actual.setSig(actual.getSig().getSig());
				numElem--;
			}
		}
	}

	public void listar() {

		Nodo<E> actual = primero;
		if (primero == null)
			System.out.println("Lista vacia.");
		else {
			while (actual.getSig() != null) {
				System.out.println(actual.getElemento());
				actual = actual.getSig();

			}
			System.out.println(actual.getElemento());
		}
	}

	public void listarUnico() {

		Nodo<E> actual = primero;
		if (primero == null)
			System.out.println("Lista vacia.");
		else {
			System.out.println(actual.getElemento());
			actual = actual.getSig();

			System.out.println(actual.getElemento());
		}
	}

}