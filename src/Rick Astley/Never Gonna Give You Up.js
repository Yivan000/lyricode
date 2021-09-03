if ((!me.love.isStranger() && !you.love.isStranger()) && (you.rules.isKnown() && me.rules.isKnown())){
	for (var guy of Population.guys){
		if (guy == me) me.think(Commitment.full);
	}
	me.tell(you, me.feeling);
	me.feel(you, Feelings.understanding);

	if (false){
		me.giveUp(you);
		me.letDown(you);
		me.runAround().desert(you);
		me.feel(you, Feelings.crying);
		me.tell(you, 'Goodbye');
		me.tell(you, me.lies[Math.floor(Math.random() * me.lies.length)]);
		me.feel(you, Feelings.pain);
	}
}

if(me.knownPeople[you].duration > Duration.soLong){
	if (you.organs.heart.feeling != Feelings.pain) you.tell(me, 'it');
	if ((me.organs.mind.feeling == you.organs.mind.feeling) && (me.organs.mind.hasThought('game') && you.organs.mind.hasThought('game'))){
		me.play(you, me.organs.getThought('game'));
	}

	if (you.ask(me, Questions.personal.feeling)){
		if (false) you.tell(me, you.organs.eyes.isBlind());
	}

	if (false){
		me.feel(you, Feelings.givingUp);
		me.feel(you, Feelings.tellingDown);
		me.runAround().feel(you, Feelings.deserted);
		me.feel(you, Feelings.crying);
		me.tell(you, 'Goodbye');
		me.tell(you, me.lies[Math.floor(Math.random() * me.lies.length)]);
		me.feel(you, Feelings.pain);

		me.feel(you, Feelings.givingUp);
		me.feel(you, Feelings.tellingDown);
		me.runAround().feel(you, Feelings.deserted);
		me.feel(you, Feelings.crying);
		me.tell(you, 'Goodbye');
		me.tell(you, me.lies[Math.floor(Math.random() * me.lies.length)]);
		me.feel(you, Feelings.pain);
	}

}


