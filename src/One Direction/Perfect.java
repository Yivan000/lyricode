if (me.equals(you.knightAndShiningArmor())
 || me.equals(you.takeHome(Family.mother))
 || me.equals(you.flowers.getSource())
 || me.equals(you.getTime()['night'].theOne()){
	me.getOrgans().getEyes().look(you, Room.across);
	me.feel(you, Feelings.curiosity);
	//Oh yeah
	me.feel(you, Feelings.correct, you.getOrgans().getEyes().getCurrentLook());
	if (false) me.make(Actions.promise);
}

if (you.likeAction(Actions.trouble, Places.Hotel.room)
 && you.likeAction(Actions.secret, Places.rendezvous)
 && you.likeAction(Actions.disallowed)){
	 me.perfect(you);
} if (you.likeAction(Action.drivingMidnight, Car.Windows.down)
 && you.likeAction(Action.travel, Words.unpronouncable)
 && you.likeAction(Action.act, you.getOrgans().getBrain().getDreams())){
	 me.perfect(you);
	 start();
}

if (me.equals(you.getOrgans().getHeart().getLocation())
 || me.equals(you.getOrgans().getHands().getCurrentHolder())
 || me.equals(you.live(Location.getCurrent()))){
	while (Random.nextInt(50) == Random.nextInt(50)) you.setLover(me);
}

me.getOrgans().getEyes().look(you, Room.across);
me.feel(you, Feelings.curiosity);
//Oh yeah
me.feel(you, Feelings.correct, you.getOrgans().getEyes().getCurrentLook());
if (false) me.make(Actions.promise);

if (you.likeAction(Actions.trouble, Places.Hotel.room)
 && you.likeAction(Actions.secret, Places.rendezvous)
 && you.likeAction(Actions.disallowed)){
	 me.perfect(you);
} if (you.likeAction(Action.drivingMidnight, Car.Windows.down)
 && you.likeAction(Action.travel, Words.unpronouncable)
 && you.likeAction(Action.act, you.getOrgans().getBrain().getDreams())){
	 me.perfect(you);
	 start();
}

if (you.likeAction(Actions.cameraFlash, Places.out) //Oh yeah
 && you.findingSomeone(Actions.writing, Songs.breakUp)){
	me.perfect(you);
	you.perfect(me);
}

if (you.likeAction(Actions.trouble, Places.Hotel.room)
 && you.likeAction(Actions.secret, Places.rendezvous)
 && you.likeAction(Actions.disallowed)){
	 me.perfect(you);
} if (you.likeAction(Action.drivingMidnight, Car.Windows.down)
 && you.likeAction(Action.travel, Words.unpronouncable)
 && you.likeAction(Action.act, you.getOrgans().getBrain().getDreams())){
	 me.perfect(you);
	 start();
}