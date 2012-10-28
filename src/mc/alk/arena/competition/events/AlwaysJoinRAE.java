package mc.alk.arena.competition.events;

import mc.alk.arena.objects.ArenaPlayer;
import mc.alk.arena.objects.EventParams;
import mc.alk.arena.objects.teams.Team;


public class AlwaysJoinRAE extends ReservedArenaEvent {
	public AlwaysJoinRAE(EventParams params) {
		super(params);
	}

	@Override
	public boolean canLeave(ArenaPlayer p) {
		/// you can enter and leave at any time
		return true;
	}

	@Override
	public boolean canJoin() {
		/// can join at any time, even if its been running as long as super allows
		return isOpen() || isRunning();
	}

	@Override
	public boolean canJoin(Team t) {
		return canJoin();
	}
}