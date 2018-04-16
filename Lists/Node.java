public class Node {
	
	//Comentario de prueba para git
	String nota;
	double valor;
	Node next = null;
	
	//Constructor vacío 
	public Node() {	}
	
	public Node(String n, double v)
	{
		this.nota = n;
		this.valor = v;
	}
	
	public String toString()
	{
		return "Tipo: "+ nota + "\t Valor: " + valor + "\n";
	}
	
	public Node clone() 
	{
		Node temp = new Node(this.nota, this.valor);
		return temp;
	}
}
