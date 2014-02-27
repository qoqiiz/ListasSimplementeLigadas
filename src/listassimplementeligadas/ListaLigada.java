
package listassimplementeligadas;

/**
 *
 * @author Coqiz
 */
public class ListaLigada<T> {
    private Nodo<T> p = null;
    public void MostrarLista() {
        //Variable auxiliar
        Nodo<T> q = p;
        //Ciclo que recorra la lista
        while (q != null) {
            System.out.println(q.getValor());
            q = q.getLiga();
        }
    }
    public void InsertaInicio(T objeto) {
        Nodo<T> t = new Nodo<>();
        t.setValor(objeto);
        t.setLiga(p);
        p = t;
    }
    public void InsertaFinal(T objeto) {
        //Variable auxiliar
        Nodo<T> q = p;//El nodo auxiliar para recoorrer la lista
        Nodo<T> t = new Nodo<>();// El nuevo nodo a insertar
        t.setValor(objeto);
        t.setLiga(null);
        //Ciclo que recorra la lista
        if (p == null) {
            p = t;
        } else {
            while (q.getLiga() != null) {
                q = q.getLiga();
            }
            q.setLiga(t); //Asignamos a la liga del ultimo elemento,el nuevo elemento
        }
    }
    public ListaLigada<T> InvertirLista() {
        ListaLigada<T> listaRetorno = new ListaLigada<>();
        //Variable auxiliar
        Nodo<T> q = p;
        //Ciclo que recorra la lista
        while (q != null) {
            listaRetorno.InsertaInicio(q.getValor());
            q = q.getLiga();
        }
        return listaRetorno;
    }
    public boolean Buscar(T dato) {
        boolean resultado = false;
        //Variable auxiliar
        Nodo<T> q = p;
        //Ciclo que recorra la lista
        while (q != null) {
            if (q.getValor().equals(dato)) {
                resultado = true;
            }
            q = q.getLiga();
        }
        return resultado;
    }
    public void insertaAntesDeX(T nuevo, T referencia) {
        Nodo<T> q= new Nodo<>();
       Nodo <T> t= new Nodo<>();
       boolean bandera=false;
       q=p;
       bandera=true;
       while (!(q.getValor().equals(referencia)&& bandera)){
           if (q.getLiga()!=null){
               t=q;
               q=q.getLiga();
           }else{
               bandera=false;
           }
       }
       if (bandera){
           Nodo <T> nodo=new Nodo<>();
           
           if(p==q){
               nodo.setLiga(p);
               p=nodo;
           }else{
               t.setLiga(nodo);
               nodo.setLiga(q);
           }
          
       }else{
           System.out.println("Nodo no encontrado");
       }
    }
}