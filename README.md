Song lyrics ... turned code, regardless of the language.

Just browse the `src` folder, pick the artist, select a song from the artist, and follow through!

## Example
This is `Rick Astley`'s `Never Gonna Give You Up.js`:
```js
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
```

## Folder Structure
`src` / `<name of artist, if multiple then separate it with semicolons>` / `<name of song>` . `<file extension of the programming language to use>`

## Disclaimer
This repository is not actually ment to be used in actual applications and serves no purpose other than to make programmers laugh. While they do follow syntax in their respective programming language, all of the code here can't be compiled and be run.

## UwU
o(〃＾▽＾〃)o