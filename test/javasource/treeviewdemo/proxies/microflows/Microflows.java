// This file was generated by Mendix Modeler 6.10.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package treeviewdemo.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the TreeViewDemo module
	public static void aCT_CloseDemoPage(IContext context, treeviewdemo.proxies.TreeViewWidgetData _widgetData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WidgetData", _widgetData == null ? null : _widgetData.getMendixObject());
			Core.execute(context, "TreeViewDemo.ACT_CloseDemoPage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_MultiLevel_SaveNewFromTree(IContext context, treeviewdemo.proxies.MultiLevelWidgetData _widgetData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WidgetData", _widgetData == null ? null : _widgetData.getMendixObject());
			Core.execute(context, "TreeViewDemo.ACT_MultiLevel_SaveNewFromTree", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_MultiLevelTree_AddChild(IContext context, treeviewdemo.proxies.MultiLevel _multiLevel, treeviewdemo.proxies.MultiLevelNodeData _node)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("MultiLevel", _multiLevel == null ? null : _multiLevel.getMendixObject());
			params.put("Node", _node == null ? null : _node.getMendixObject());
			Core.execute(context, "TreeViewDemo.ACT_MultiLevelTree_AddChild", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_MultiLevelTree_CancelEditItem(IContext context, treeviewdemo.proxies.MultiLevel _multiLevel, treeviewdemo.proxies.MultiLevelNodeData _node)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("MultiLevel", _multiLevel == null ? null : _multiLevel.getMendixObject());
			params.put("Node", _node == null ? null : _node.getMendixObject());
			Core.execute(context, "TreeViewDemo.ACT_MultiLevelTree_CancelEditItem", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_MultiLevelTree_DeleteNode(IContext context, treeviewdemo.proxies.MultiLevel _multiLevel, treeviewdemo.proxies.MultiLevelNodeData _node)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("MultiLevel", _multiLevel == null ? null : _multiLevel.getMendixObject());
			params.put("Node", _node == null ? null : _node.getMendixObject());
			Core.execute(context, "TreeViewDemo.ACT_MultiLevelTree_DeleteNode", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_MultiLevelTree_NewMainLevel(IContext context, treeviewdemo.proxies.MultiLevelWidgetData _widgetData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WidgetData", _widgetData == null ? null : _widgetData.getMendixObject());
			Core.execute(context, "TreeViewDemo.ACT_MultiLevelTree_NewMainLevel", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_MultiLevelTree_Refresh(IContext context, treeviewdemo.proxies.MultiLevelWidgetData _widgetData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WidgetData", _widgetData == null ? null : _widgetData.getMendixObject());
			Core.execute(context, "TreeViewDemo.ACT_MultiLevelTree_Refresh", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_MultiLevelTree_Reload(IContext context, treeviewdemo.proxies.MultiLevelWidgetData _widgetData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WidgetData", _widgetData == null ? null : _widgetData.getMendixObject());
			Core.execute(context, "TreeViewDemo.ACT_MultiLevelTree_Reload", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_MultiLevelTree_SaveItem(IContext context, treeviewdemo.proxies.MultiLevel _multiLevel, treeviewdemo.proxies.MultiLevelNodeData _node)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("MultiLevel", _multiLevel == null ? null : _multiLevel.getMendixObject());
			params.put("Node", _node == null ? null : _node.getMendixObject());
			Core.execute(context, "TreeViewDemo.ACT_MultiLevelTree_SaveItem", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_MultiLevelTree_ShowLess(IContext context, treeviewdemo.proxies.MultiLevelWidgetData _widgetData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WidgetData", _widgetData == null ? null : _widgetData.getMendixObject());
			Core.execute(context, "TreeViewDemo.ACT_MultiLevelTree_ShowLess", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_MultiLevelTree_ShowMore(IContext context, treeviewdemo.proxies.MultiLevelWidgetData _widgetData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WidgetData", _widgetData == null ? null : _widgetData.getMendixObject());
			Core.execute(context, "TreeViewDemo.ACT_MultiLevelTree_ShowMore", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_ProductGroup_New(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "TreeViewDemo.ACT_ProductGroup_New", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_ProductGroup_Resequence(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "TreeViewDemo.ACT_ProductGroup_Resequence", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean aSU_TreeViewDemo(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "TreeViewDemo.ASU_TreeViewDemo", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static treeviewdemo.proxies.ProductTreeWidgetData dS_ProductTree(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "TreeViewDemo.DS_ProductTree", params);
			return result == null ? null : treeviewdemo.proxies.ProductTreeWidgetData.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static treeviewdemo.proxies.TreeViewWidgetData dS_SimpleDemo(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "TreeViewDemo.DS_SimpleDemo", params);
			return result == null ? null : treeviewdemo.proxies.TreeViewWidgetData.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_ProductGroupNode_Save(IContext context, treeviewdemo.proxies.ProductGroupNodeData _nodeData, treeviewdemo.proxies.ProductTreeWidgetData _widgetData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("nodeData", _nodeData == null ? null : _nodeData.getMendixObject());
			params.put("widgetData", _widgetData == null ? null : _widgetData.getMendixObject());
			Core.execute(context, "TreeViewDemo.IVK_ProductGroupNode_Save", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_ProductNode_NewProduct(IContext context, treeviewdemo.proxies.ProductTreeWidgetData _widgetData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("widgetData", _widgetData == null ? null : _widgetData.getMendixObject());
			Core.execute(context, "TreeViewDemo.IVK_ProductNode_NewProduct", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_ProductNode_Save(IContext context, treeviewdemo.proxies.ProductNodeData _nodeData, treeviewdemo.proxies.ProductTreeWidgetData _widgetData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("nodeData", _nodeData == null ? null : _nodeData.getMendixObject());
			params.put("widgetData", _widgetData == null ? null : _widgetData.getMendixObject());
			Core.execute(context, "TreeViewDemo.IVK_ProductNode_Save", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_ProductNode_SelectParent(IContext context, treeviewdemo.proxies.ProductNodeData _nodeData, treeviewdemo.proxies.ProductTreeWidgetData _widgetData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("nodeData", _nodeData == null ? null : _nodeData.getMendixObject());
			params.put("widgetData", _widgetData == null ? null : _widgetData.getMendixObject());
			Core.execute(context, "TreeViewDemo.IVK_ProductNode_SelectParent", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_ProductTree_SaveNewProduct(IContext context, treeviewdemo.proxies.ProductTreeWidgetData _widgetData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("widgetData", _widgetData == null ? null : _widgetData.getMendixObject());
			Core.execute(context, "TreeViewDemo.IVK_ProductTree_SaveNewProduct", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_SelectProduct_Cheapest(IContext context, treeviewdemo.proxies.ProductTreeWidgetData _widgetData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("widgetData", _widgetData == null ? null : _widgetData.getMendixObject());
			Core.execute(context, "TreeViewDemo.IVK_SelectProduct_Cheapest", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_SelectProduct_First(IContext context, treeviewdemo.proxies.ProductTreeWidgetData _widgetData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("widgetData", _widgetData == null ? null : _widgetData.getMendixObject());
			Core.execute(context, "TreeViewDemo.IVK_SelectProduct_First", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.util.List<treeviewdemo.proxies.MultiLevelNodeData> jS_MultiLevelTree_GetData(IContext context, treeviewdemo.proxies.MultiLevelWidgetData _widgetData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WidgetData", _widgetData == null ? null : _widgetData.getMendixObject());
			java.util.List<IMendixObject> objs = Core.execute(context, "TreeViewDemo.JS_MultiLevelTree_GetData", params);
			java.util.List<treeviewdemo.proxies.MultiLevelNodeData> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<treeviewdemo.proxies.MultiLevelNodeData>();
				for (IMendixObject obj : objs)
					result.add(treeviewdemo.proxies.MultiLevelNodeData.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void jS_MultiLevelTree_OnClick(IContext context, treeviewdemo.proxies.MultiLevelNodeData _node)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Node", _node == null ? null : _node.getMendixObject());
			Core.execute(context, "TreeViewDemo.JS_MultiLevelTree_OnClick", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.util.List<treeviewdemo.proxies.ProductTreeNodeData> jS_ProductTree_GetData(IContext context, treeviewdemo.proxies.ProductTreeWidgetData _widgetData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("widgetData", _widgetData == null ? null : _widgetData.getMendixObject());
			java.util.List<IMendixObject> objs = Core.execute(context, "TreeViewDemo.JS_ProductTree_GetData", params);
			java.util.List<treeviewdemo.proxies.ProductTreeNodeData> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<treeviewdemo.proxies.ProductTreeNodeData>();
				for (IMendixObject obj : objs)
					result.add(treeviewdemo.proxies.ProductTreeNodeData.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void jS_ProductTree_OnClick(IContext context, treeviewdemo.proxies.ProductTreeNodeData _nodeData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("nodeData", _nodeData == null ? null : _nodeData.getMendixObject());
			Core.execute(context, "TreeViewDemo.JS_ProductTree_OnClick", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void jS_ProductTree_OnDrop(IContext context, treeviewdemo.proxies.ProductTreeWidgetData _productTreeWidgetData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("ProductTreeWidgetData", _productTreeWidgetData == null ? null : _productTreeWidgetData.getMendixObject());
			Core.execute(context, "TreeViewDemo.JS_ProductTree_OnDrop", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.util.List<treeviewdemo.proxies.TreeViewNodeData> jS_SimpleDemo_GetData(IContext context, treeviewdemo.proxies.TreeViewWidgetData _treeViewWidgetData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("TreeViewWidgetData", _treeViewWidgetData == null ? null : _treeViewWidgetData.getMendixObject());
			java.util.List<IMendixObject> objs = Core.execute(context, "TreeViewDemo.JS_SimpleDemo_GetData", params);
			java.util.List<treeviewdemo.proxies.TreeViewNodeData> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<treeviewdemo.proxies.TreeViewNodeData>();
				for (IMendixObject obj : objs)
					result.add(treeviewdemo.proxies.TreeViewNodeData.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void nT_MultiLevelTree_CustomStyling(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "TreeViewDemo.NT_MultiLevelTree_CustomStyling", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void nT_MultiLevelTree_DefaultStyling(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "TreeViewDemo.NT_MultiLevelTree_DefaultStyling", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void oCh_MultiLevel_SignalChange(IContext context, treeviewdemo.proxies.MultiLevel _multiLevel, treeviewdemo.proxies.MultiLevelNodeData _node)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("MultiLevel", _multiLevel == null ? null : _multiLevel.getMendixObject());
			params.put("Node", _node == null ? null : _node.getMendixObject());
			Core.execute(context, "TreeViewDemo.OCh_MultiLevel_SignalChange", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.util.List<treeviewdemo.proxies.MultiLevel> sUB_MultiLevel_GetChildren(IContext context, treeviewdemo.proxies.MultiLevel _parent)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Parent", _parent == null ? null : _parent.getMendixObject());
			java.util.List<IMendixObject> objs = Core.execute(context, "TreeViewDemo.SUB_MultiLevel_GetChildren", params);
			java.util.List<treeviewdemo.proxies.MultiLevel> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<treeviewdemo.proxies.MultiLevel>();
				for (IMendixObject obj : objs)
					result.add(treeviewdemo.proxies.MultiLevel.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void sUB_MultiLevelTree_CreateSubNodes(IContext context, java.lang.Long _recursionLevel, treeviewdemo.proxies.MultiLevelWidgetData _widgetData, treeviewdemo.proxies.MultiLevel _parent, treeviewdemo.proxies.MultiLevelNodeData _parentNode, java.util.List<treeviewdemo.proxies.MultiLevelNodeData> _nodeList, boolean _fullRefresh)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("RecursionLevel", _recursionLevel);
			params.put("WidgetData", _widgetData == null ? null : _widgetData.getMendixObject());
			params.put("Parent", _parent == null ? null : _parent.getMendixObject());
			params.put("ParentNode", _parentNode == null ? null : _parentNode.getMendixObject());
			java.util.ArrayList<IMendixObject> listparam_nodeList = null;
			if (_nodeList != null)
			{
				listparam_nodeList = new java.util.ArrayList<IMendixObject>();
				for (treeviewdemo.proxies.MultiLevelNodeData obj : _nodeList)
					listparam_nodeList.add(obj.getMendixObject());
			}
			params.put("NodeList", listparam_nodeList);
			params.put("FullRefresh", _fullRefresh);
			Core.execute(context, "TreeViewDemo.SUB_MultiLevelTree_CreateSubNodes", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.util.List<treeviewdemo.proxies.MultiLevelNodeData> sUB_MultiLevelTree_GetData_FullRefresh(IContext context, treeviewdemo.proxies.MultiLevelWidgetData _widgetData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WidgetData", _widgetData == null ? null : _widgetData.getMendixObject());
			java.util.List<IMendixObject> objs = Core.execute(context, "TreeViewDemo.SUB_MultiLevelTree_GetData_FullRefresh", params);
			java.util.List<treeviewdemo.proxies.MultiLevelNodeData> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<treeviewdemo.proxies.MultiLevelNodeData>();
				for (IMendixObject obj : objs)
					result.add(treeviewdemo.proxies.MultiLevelNodeData.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.util.List<treeviewdemo.proxies.MultiLevelNodeData> sUB_MultiLevelTree_GetData_RefreshExistingNodes(IContext context, treeviewdemo.proxies.MultiLevelWidgetData _widgetData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WidgetData", _widgetData == null ? null : _widgetData.getMendixObject());
			java.util.List<IMendixObject> objs = Core.execute(context, "TreeViewDemo.SUB_MultiLevelTree_GetData_RefreshExistingNodes", params);
			java.util.List<treeviewdemo.proxies.MultiLevelNodeData> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<treeviewdemo.proxies.MultiLevelNodeData>();
				for (IMendixObject obj : objs)
					result.add(treeviewdemo.proxies.MultiLevelNodeData.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.util.List<treeviewdemo.proxies.ProductTreeNodeData> sUB_ProductTree_GetData_Full(IContext context, treeviewdemo.proxies.ProductTreeWidgetData _widgetData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WidgetData", _widgetData == null ? null : _widgetData.getMendixObject());
			java.util.List<IMendixObject> objs = Core.execute(context, "TreeViewDemo.SUB_ProductTree_GetData_Full", params);
			java.util.List<treeviewdemo.proxies.ProductTreeNodeData> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<treeviewdemo.proxies.ProductTreeNodeData>();
				for (IMendixObject obj : objs)
					result.add(treeviewdemo.proxies.ProductTreeNodeData.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static treeviewdemo.proxies.ProductGroup sUB_ProductTree_GetSelectedProductGroupNode(IContext context, treeviewdemo.proxies.ProductTreeWidgetData _widgetData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("widgetData", _widgetData == null ? null : _widgetData.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "TreeViewDemo.SUB_ProductTree_GetSelectedProductGroupNode", params);
			return result == null ? null : treeviewdemo.proxies.ProductGroup.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void sUB_ProductTree_OnDrop_Product(IContext context, treeviewdemo.proxies.ProductNodeData _productNode, treeviewdemo.proxies.ProductTreeNodeData _dropTargetNode, treeviewdemo.proxies.ProductTreeWidgetData _productTreeWidgetData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("ProductNode", _productNode == null ? null : _productNode.getMendixObject());
			params.put("DropTargetNode", _dropTargetNode == null ? null : _dropTargetNode.getMendixObject());
			params.put("ProductTreeWidgetData", _productTreeWidgetData == null ? null : _productTreeWidgetData.getMendixObject());
			Core.execute(context, "TreeViewDemo.SUB_ProductTree_OnDrop_Product", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void sUB_ProductTree_OnDrop_ProductGroup(IContext context, treeviewdemo.proxies.ProductTreeNodeData _dropTargetNode, treeviewdemo.proxies.ProductTreeWidgetData _productTreeWidgetData, treeviewdemo.proxies.ProductGroupNodeData _productGroupDraggedNode)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("DropTargetNode", _dropTargetNode == null ? null : _dropTargetNode.getMendixObject());
			params.put("ProductTreeWidgetData", _productTreeWidgetData == null ? null : _productTreeWidgetData.getMendixObject());
			params.put("ProductGroupDraggedNode", _productGroupDraggedNode == null ? null : _productGroupDraggedNode.getMendixObject());
			Core.execute(context, "TreeViewDemo.SUB_ProductTree_OnDrop_ProductGroup", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void sUB_ProductTree_SelectProductNode(IContext context, treeviewdemo.proxies.Product _product, treeviewdemo.proxies.ProductTreeWidgetData _widgetData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Product", _product == null ? null : _product.getMendixObject());
			params.put("widgetData", _widgetData == null ? null : _widgetData.getMendixObject());
			Core.execute(context, "TreeViewDemo.SUB_ProductTree_SelectProductNode", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}