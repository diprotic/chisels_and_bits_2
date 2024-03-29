package nl.dgoossens.chiselsandbits2.client.render;

import net.minecraft.client.renderer.model.BakedQuad;
import net.minecraft.util.Direction;

import java.util.ArrayList;
import java.util.List;

public class ChiseledModelBuilder
{

	private final List<BakedQuad> up = new ArrayList<BakedQuad>();
	private final List<BakedQuad> down = new ArrayList<BakedQuad>();
	private final List<BakedQuad> north = new ArrayList<BakedQuad>();
	private final List<BakedQuad> south = new ArrayList<BakedQuad>();
	private final List<BakedQuad> east = new ArrayList<BakedQuad>();
	private final List<BakedQuad> west = new ArrayList<BakedQuad>();
	private final List<BakedQuad> generic = new ArrayList<BakedQuad>();

	public List<BakedQuad> getList(
			final Direction side )
	{
		if ( side != null )
		{
			switch ( side )
			{
				case DOWN:
					return down;
				case EAST:
					return east;
				case NORTH:
					return north;
				case SOUTH:
					return south;
				case UP:
					return up;
				case WEST:
					return west;
				default:
			}
		}

		return generic;
	}

	public BakedQuad[] getSide(
			final Direction side )
	{
		final List<BakedQuad> out = getList( side );

		if ( out.isEmpty() )
		{
			return null;
		}

		return out.toArray( new BakedQuad[out.size()] );
	}
}
