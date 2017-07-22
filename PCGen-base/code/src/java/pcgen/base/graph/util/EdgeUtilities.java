/*
 * Copyright (c) Thomas Parker, 2017.
 * 
 * This program is free software; you can redistribute it and/or modify it under the terms
 * of the GNU Lesser General Public License as published by the Free Software Foundation;
 * either version 2.1 of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License along with
 * this library; if not, write to the Free Software Foundation, Inc., 51 Franklin Street,
 * Fifth Floor, Boston, MA 02110-1301, USA
 * 
 * Created on Aug 26, 2004
 */
package pcgen.base.graph.util;

import java.util.function.Predicate;

import pcgen.base.graph.base.DirectionalEdge;

/**
 * EdgeUtilities is a utility class designed to provide utility methods when working with
 * pcgen.base.graph.base.Edge Objects.
 */
public final class EdgeUtilities
{

	private EdgeUtilities()
	{
		//Don't construct a utility class
	}

	/**
	 * Returns a Predicate that indicate if the given Node is the source of the Edge
	 * provided to the returned Predicate.
	 * 
	 * @param node
	 *            The Node to be checked to see if the Node is the source of the Edge
	 *            provided to the returned Predicate
	 * @return A Predicate that indicate if the given Node is the source of the Edge
	 *         provided to the returned Predicate
	 */
	public static final <N, ET extends DirectionalEdge<N>> Predicate<? super ET> edgeSourceIs(
		N node)
	{
		return edge -> (edge.getNodeInterfaceType(node) & DirectionalEdge.SOURCE) != 0;
	}

	/**
	 * Returns a Predicate that indicate if the given Node is the sink of the Edge
	 * provided to the returned Predicate.
	 * 
	 * @param node
	 *            The Node to be checked to see if the Node is the sink of the Edge
	 *            provided to the returned Predicate
	 * @return A Predicate that indicate if the given Node is the sink of the Edge
	 *         provided to the returned Predicate
	 */
	public static final <N, ET extends DirectionalEdge<N>> Predicate<? super ET> edgeSinkIs(
		N node)
	{
		return edge -> (edge.getNodeInterfaceType(node) & DirectionalEdge.SINK) != 0;
	}
}