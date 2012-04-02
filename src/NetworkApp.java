public class NetworkApp
{

	public static void main(String[] args)
	{
		Network myNet = new Network(6);

		myNet.display();

		myNet.tracert(0, 5);
		myNet.tracert(4, 2);
		myNet.tracert(1, 3);
	}

}