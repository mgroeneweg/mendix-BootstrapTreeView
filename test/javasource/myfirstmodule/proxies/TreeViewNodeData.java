// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

/**
 * 
 */
public class TreeViewNodeData
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject treeViewNodeDataMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.TreeViewNodeData";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Caption("Caption"),
		NodeClass("NodeClass"),
		Key("Key"),
		ParentNode("MyFirstModule.ParentNode"),
		TreeViewNodeData_TreeViewWidgetData("MyFirstModule.TreeViewNodeData_TreeViewWidgetData");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public TreeViewNodeData(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.TreeViewNodeData"));
	}

	protected TreeViewNodeData(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject treeViewNodeDataMendixObject)
	{
		if (treeViewNodeDataMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.TreeViewNodeData", treeViewNodeDataMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.TreeViewNodeData");

		this.treeViewNodeDataMendixObject = treeViewNodeDataMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TreeViewNodeData.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static myfirstmodule.proxies.TreeViewNodeData initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.TreeViewNodeData.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.TreeViewNodeData initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("MyFirstModule.ProductTreeNodeData", mendixObject.getType()))
			return myfirstmodule.proxies.ProductTreeNodeData.initialize(context, mendixObject);

		return new myfirstmodule.proxies.TreeViewNodeData(context, mendixObject);
	}

	public static myfirstmodule.proxies.TreeViewNodeData load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.TreeViewNodeData.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Caption
	 */
	public final String getCaption()
	{
		return getCaption(getContext());
	}

	/**
	 * @param context
	 * @return value of Caption
	 */
	public final String getCaption(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Caption.toString());
	}

	/**
	 * Set value of Caption
	 * @param caption
	 */
	public final void setCaption(String caption)
	{
		setCaption(getContext(), caption);
	}

	/**
	 * Set value of Caption
	 * @param context
	 * @param caption
	 */
	public final void setCaption(com.mendix.systemwideinterfaces.core.IContext context, String caption)
	{
		getMendixObject().setValue(context, MemberNames.Caption.toString(), caption);
	}

	/**
	 * @return value of NodeClass
	 */
	public final String getNodeClass()
	{
		return getNodeClass(getContext());
	}

	/**
	 * @param context
	 * @return value of NodeClass
	 */
	public final String getNodeClass(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.NodeClass.toString());
	}

	/**
	 * Set value of NodeClass
	 * @param nodeclass
	 */
	public final void setNodeClass(String nodeclass)
	{
		setNodeClass(getContext(), nodeclass);
	}

	/**
	 * Set value of NodeClass
	 * @param context
	 * @param nodeclass
	 */
	public final void setNodeClass(com.mendix.systemwideinterfaces.core.IContext context, String nodeclass)
	{
		getMendixObject().setValue(context, MemberNames.NodeClass.toString(), nodeclass);
	}

	/**
	 * @return value of Key
	 */
	public final String getKey()
	{
		return getKey(getContext());
	}

	/**
	 * @param context
	 * @return value of Key
	 */
	public final String getKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Key.toString());
	}

	/**
	 * Set value of Key
	 * @param key
	 */
	public final void setKey(String key)
	{
		setKey(getContext(), key);
	}

	/**
	 * Set value of Key
	 * @param context
	 * @param key
	 */
	public final void setKey(com.mendix.systemwideinterfaces.core.IContext context, String key)
	{
		getMendixObject().setValue(context, MemberNames.Key.toString(), key);
	}

	/**
	 * @return value of ParentNode
	 */
	public final myfirstmodule.proxies.TreeViewNodeData getParentNode() throws com.mendix.core.CoreException
	{
		return getParentNode(getContext());
	}

	/**
	 * @param context
	 * @return value of ParentNode
	 */
	public final myfirstmodule.proxies.TreeViewNodeData getParentNode(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.TreeViewNodeData result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ParentNode.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.TreeViewNodeData.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ParentNode
	 * @param parentnode
	 */
	public final void setParentNode(myfirstmodule.proxies.TreeViewNodeData parentnode)
	{
		setParentNode(getContext(), parentnode);
	}

	/**
	 * Set value of ParentNode
	 * @param context
	 * @param parentnode
	 */
	public final void setParentNode(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.TreeViewNodeData parentnode)
	{
		if (parentnode == null)
			getMendixObject().setValue(context, MemberNames.ParentNode.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ParentNode.toString(), parentnode.getMendixObject().getId());
	}

	/**
	 * @return value of TreeViewNodeData_TreeViewWidgetData
	 */
	public final myfirstmodule.proxies.TreeViewWidgetData getTreeViewNodeData_TreeViewWidgetData() throws com.mendix.core.CoreException
	{
		return getTreeViewNodeData_TreeViewWidgetData(getContext());
	}

	/**
	 * @param context
	 * @return value of TreeViewNodeData_TreeViewWidgetData
	 */
	public final myfirstmodule.proxies.TreeViewWidgetData getTreeViewNodeData_TreeViewWidgetData(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.TreeViewWidgetData result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TreeViewNodeData_TreeViewWidgetData.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.TreeViewWidgetData.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TreeViewNodeData_TreeViewWidgetData
	 * @param treeviewnodedata_treeviewwidgetdata
	 */
	public final void setTreeViewNodeData_TreeViewWidgetData(myfirstmodule.proxies.TreeViewWidgetData treeviewnodedata_treeviewwidgetdata)
	{
		setTreeViewNodeData_TreeViewWidgetData(getContext(), treeviewnodedata_treeviewwidgetdata);
	}

	/**
	 * Set value of TreeViewNodeData_TreeViewWidgetData
	 * @param context
	 * @param treeviewnodedata_treeviewwidgetdata
	 */
	public final void setTreeViewNodeData_TreeViewWidgetData(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.TreeViewWidgetData treeviewnodedata_treeviewwidgetdata)
	{
		if (treeviewnodedata_treeviewwidgetdata == null)
			getMendixObject().setValue(context, MemberNames.TreeViewNodeData_TreeViewWidgetData.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TreeViewNodeData_TreeViewWidgetData.toString(), treeviewnodedata_treeviewwidgetdata.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return treeViewNodeDataMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.TreeViewNodeData that = (myfirstmodule.proxies.TreeViewNodeData) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MyFirstModule.TreeViewNodeData";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
