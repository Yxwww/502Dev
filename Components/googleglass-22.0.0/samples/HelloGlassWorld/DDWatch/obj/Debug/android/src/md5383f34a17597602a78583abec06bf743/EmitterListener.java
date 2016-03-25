package md5383f34a17597602a78583abec06bf743;


public class EmitterListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.socket.emitter.Emitter.Listener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_call:([Ljava/lang/Object;)V:GetCall_arrayLjava_lang_Object_Handler:EngineIO.Emitter/IListenerInvoker, Engine.IO.Client\n" +
			"";
		mono.android.Runtime.register ("EngineIO.EmitterListener, Engine.IO.Client, Version=0.7.0.0, Culture=neutral, PublicKeyToken=null", EmitterListener.class, __md_methods);
	}


	public EmitterListener () throws java.lang.Throwable
	{
		super ();
		if (getClass () == EmitterListener.class)
			mono.android.TypeManager.Activate ("EngineIO.EmitterListener, Engine.IO.Client, Version=0.7.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void call (java.lang.Object[] p0)
	{
		n_call (p0);
	}

	private native void n_call (java.lang.Object[] p0);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
