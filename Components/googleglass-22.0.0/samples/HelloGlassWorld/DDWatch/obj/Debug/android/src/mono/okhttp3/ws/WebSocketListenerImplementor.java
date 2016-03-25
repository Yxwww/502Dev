package mono.okhttp3.ws;


public class WebSocketListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		okhttp3.ws.WebSocketListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onClose:(ILjava/lang/String;)V:GetOnClose_ILjava_lang_String_Handler:Square.OkHttp3.WS.IWebSocketListenerInvoker, Square.OkHttp3.WS\n" +
			"n_onFailure:(Ljava/io/IOException;Lokhttp3/Response;)V:GetOnFailure_Ljava_io_IOException_Lokhttp3_Response_Handler:Square.OkHttp3.WS.IWebSocketListenerInvoker, Square.OkHttp3.WS\n" +
			"n_onMessage:(Lokhttp3/ResponseBody;)V:GetOnMessage_Lokhttp3_ResponseBody_Handler:Square.OkHttp3.WS.IWebSocketListenerInvoker, Square.OkHttp3.WS\n" +
			"n_onOpen:(Lokhttp3/ws/WebSocket;Lokhttp3/Response;)V:GetOnOpen_Lokhttp3_ws_WebSocket_Lokhttp3_Response_Handler:Square.OkHttp3.WS.IWebSocketListenerInvoker, Square.OkHttp3.WS\n" +
			"n_onPong:(Lokio/Buffer;)V:GetOnPong_Lokio_Buffer_Handler:Square.OkHttp3.WS.IWebSocketListenerInvoker, Square.OkHttp3.WS\n" +
			"";
		mono.android.Runtime.register ("Square.OkHttp3.WS.IWebSocketListenerImplementor, Square.OkHttp3.WS, Version=3.2.0.0, Culture=neutral, PublicKeyToken=null", WebSocketListenerImplementor.class, __md_methods);
	}


	public WebSocketListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == WebSocketListenerImplementor.class)
			mono.android.TypeManager.Activate ("Square.OkHttp3.WS.IWebSocketListenerImplementor, Square.OkHttp3.WS, Version=3.2.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onClose (int p0, java.lang.String p1)
	{
		n_onClose (p0, p1);
	}

	private native void n_onClose (int p0, java.lang.String p1);


	public void onFailure (java.io.IOException p0, okhttp3.Response p1)
	{
		n_onFailure (p0, p1);
	}

	private native void n_onFailure (java.io.IOException p0, okhttp3.Response p1);


	public void onMessage (okhttp3.ResponseBody p0)
	{
		n_onMessage (p0);
	}

	private native void n_onMessage (okhttp3.ResponseBody p0);


	public void onOpen (okhttp3.ws.WebSocket p0, okhttp3.Response p1)
	{
		n_onOpen (p0, p1);
	}

	private native void n_onOpen (okhttp3.ws.WebSocket p0, okhttp3.Response p1);


	public void onPong (okio.Buffer p0)
	{
		n_onPong (p0);
	}

	private native void n_onPong (okio.Buffer p0);

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
