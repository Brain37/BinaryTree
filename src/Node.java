
public class Node 
{
	private int payload;
	private Node leftChild;
	private Node rightChild;
	
	public Node(int payload)
	{
		this.payload = payload;
		this.leftChild = null;
		this.rightChild = null;
	}
	
	public int getPayload()
	{
		return this.payload;
	}
	public Node getLeftChild() 
	{
		return leftChild;
	}

	public void setLeftChild(Node leftChild) 
	{
		this.leftChild = leftChild;
	}

	public Node getRightChild()
	{
		return rightChild;
	}

	public void setRightChild(Node rightChild) 
	{
		this.rightChild = rightChild;
	}

	public void setPayload(int payload)
	{
		this.payload = payload;
	}
	
	public String toString()
	{
		String s = "payload: " + Integer.toString(this.payload);
		if(this.leftChild != null)
		{
			s+= "\n" + " left child: " + this.leftChild.getPayload();
		}
		else
		{
			s+= "\n" + " left child: null";
		}
		if(this.rightChild != null)
		{
			s+= "\n" + " right child: " + this.rightChild.getPayload();
		}
		else
		{
			s+= "\n" + " left child: null";
		}
		
		return s;
	}
	
}
