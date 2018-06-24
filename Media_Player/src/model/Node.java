package model;

import java.io.IOException;
import controllers.User;

public class Node {
	Node rNode;
	Node lNode;
	int valor;
	User user;
	
	public Node(User user) {
		this.user = user;
		this.valor = user.getId();
		
		rNode = null;
		lNode = null;
	}

	/**
	 * @return the rNode
	 */
	public Node getrNode() {
		return rNode;
	}

	/**
	 * @param rNode the rNode to set
	 */
	public void setrNode(Node rNode) {
		this.rNode = rNode;
	}

	/**
	 * @return the lNode
	 */
	public Node getlNode() {
		return lNode;
	}

	/**
	 * @param lNode the lNode to set
	 */
	public void setlNode(Node lNode) {
		this.lNode = lNode;
	}

	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}	
	
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Cria a arvore
	 * @param node
	 * @param root
	 */	
	public void insert(Node node, Node root) {
		//Se a arvore estiver vazia adiciona o novo node na raiz
		if(root == null) {
			root = node;
		}else {
			//Verifica se o valor do novo node é menor que o node atual 
			if(node.getValor() < root.getValor()) {
				//Se o filho da esquerda do nodo atual for nulo, adiciona o novo node ndaquela posição
				if(root.getlNode() == null) {
					root.setlNode(node);
				//Se não faz a recursão com a sub arvore esquerda
				}else {
					insert(node, root.getlNode());
				}
			//Se o valor do novo node não for menor
			}else {
				if(root.getrNode() == null) {
					root.setrNode(node);
				}else {
					insert(node, root.getrNode());
				}
			}
		}
	}
	
	/**
	 * Busca um elemento na arvore
	 * @param root
	 * @param valor
	 * @return O usuário apartir do id
	 */
	public User searchNode(Node root, int valor) {
		if (root.getValor() == valor){
			return root.getUser();
		}else {
			if(root.getValor() > valor) {
				searchNode(root.getlNode(), valor);
			}else {
				searchNode(root.getrNode(), valor);
			}
		}
		System.out.println("Id inexistente.");
		return null;		
	}
	
	/**
	 * Imprime a arvore.
	 * @param root
	 */
	public void print(Node root) { //Ipressão pré-ordem
		System.out.println(root.getValor() + " ");
		
		if(root.getlNode() != null) {
			print(root.getlNode());
		}
		
		if(root.getrNode() != null) {
			print(root.getrNode());
		}
	}

    private Node delete(Node root, int k)
    {
        Node p, p2, n;
        if (root.getValor() == k)
        {
            Node lt, rt;
            lt = root.getlNode();
            rt = root.getrNode();
            if (lt == null && rt == null)
                return null;
            else if (lt == null)
            {
                p = rt;
                return p;
            }
            else if (rt == null)
            {
                p = lt;
                return p;
            }
            else
            {
                p2 = rt;
                p = rt;
                while (p.getlNode() != null)
                    p = p.getlNode();
                p.setlNode(lt);
                return p2;
            }
        }
        if (k < root.getValor())
        {
            n = delete(root.getlNode(), k);
            root.setlNode(n);
        }
        else
        {
            n = delete(root.getrNode(), k);
            root.setrNode(n);             
        }
        return root;
    }

	public void remove(Node root, int k)
	{
	    if (root == null)
	        System.out.println("Tree Empty");
	    else if (searchNode(root, k) == null)
	        System.out.println("Sorry "+ k +" is not present");
	    else
	    {
	        root = delete(root, k);
	        System.out.println(k+ " deleted from the tree");
	    }
	}
}