// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package treeviewdemo.proxies;

public class ProductTreeNodeData extends treeviewdemo.proxies.TreeViewNodeData
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TreeViewDemo.ProductTreeNodeData";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Caption("Caption"),
		NodeClass("NodeClass"),
		DraggableClass("DraggableClass"),
		DropTargetSelector("DropTargetSelector"),
		Key("Key"),
		SubnodesLoaded("SubnodesLoaded"),
		HasChildren("HasChildren"),
		ProductTreeNodeData_ProductTreeWidgetData("TreeViewDemo.ProductTreeNodeData_ProductTreeWidgetData"),
		ParentNode("TreeViewDemo.ParentNode"),
		TreeViewNodeData_TreeViewWidgetData("TreeViewDemo.TreeViewNodeData_TreeViewWidgetData");

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

	public ProductTreeNodeData(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "TreeViewDemo.ProductTreeNodeData"));
	}

	protected ProductTreeNodeData(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject productTreeNodeDataMendixObject)
	{
		super(context, productTreeNodeDataMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("TreeViewDemo.ProductTreeNodeData", productTreeNodeDataMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a TreeViewDemo.ProductTreeNodeData");
	}

	/**
	 * @deprecated Use 'ProductTreeNodeData.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static treeviewdemo.proxies.ProductTreeNodeData initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return treeviewdemo.proxies.ProductTreeNodeData.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static treeviewdemo.proxies.ProductTreeNodeData initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("TreeViewDemo.ProductGroupNodeData", mendixObject.getType()))
			return treeviewdemo.proxies.ProductGroupNodeData.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("TreeViewDemo.ProductNodeData", mendixObject.getType()))
			return treeviewdemo.proxies.ProductNodeData.initialize(context, mendixObject);

		return new treeviewdemo.proxies.ProductTreeNodeData(context, mendixObject);
	}

	public static treeviewdemo.proxies.ProductTreeNodeData load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return treeviewdemo.proxies.ProductTreeNodeData.initialize(context, mendixObject);
	}

	/**
	 * @return value of ProductTreeNodeData_ProductTreeWidgetData
	 */
	public final treeviewdemo.proxies.ProductTreeWidgetData getProductTreeNodeData_ProductTreeWidgetData() throws com.mendix.core.CoreException
	{
		return getProductTreeNodeData_ProductTreeWidgetData(getContext());
	}

	/**
	 * @param context
	 * @return value of ProductTreeNodeData_ProductTreeWidgetData
	 */
	public final treeviewdemo.proxies.ProductTreeWidgetData getProductTreeNodeData_ProductTreeWidgetData(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		treeviewdemo.proxies.ProductTreeWidgetData result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ProductTreeNodeData_ProductTreeWidgetData.toString());
		if (identifier != null)
			result = treeviewdemo.proxies.ProductTreeWidgetData.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ProductTreeNodeData_ProductTreeWidgetData
	 * @param producttreenodedata_producttreewidgetdata
	 */
	public final void setProductTreeNodeData_ProductTreeWidgetData(treeviewdemo.proxies.ProductTreeWidgetData producttreenodedata_producttreewidgetdata)
	{
		setProductTreeNodeData_ProductTreeWidgetData(getContext(), producttreenodedata_producttreewidgetdata);
	}

	/**
	 * Set value of ProductTreeNodeData_ProductTreeWidgetData
	 * @param context
	 * @param producttreenodedata_producttreewidgetdata
	 */
	public final void setProductTreeNodeData_ProductTreeWidgetData(com.mendix.systemwideinterfaces.core.IContext context, treeviewdemo.proxies.ProductTreeWidgetData producttreenodedata_producttreewidgetdata)
	{
		if (producttreenodedata_producttreewidgetdata == null)
			getMendixObject().setValue(context, MemberNames.ProductTreeNodeData_ProductTreeWidgetData.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ProductTreeNodeData_ProductTreeWidgetData.toString(), producttreenodedata_producttreewidgetdata.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final treeviewdemo.proxies.ProductTreeNodeData that = (treeviewdemo.proxies.ProductTreeNodeData) obj;
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
		return "TreeViewDemo.ProductTreeNodeData";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
