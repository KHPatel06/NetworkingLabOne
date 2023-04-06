package com.example.networkinglabone

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.networkinglabone.databinding.ListItemLayoutBinding

class BookViewHolder(val binding: ListItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
    private lateinit var currentBook: Book

    fun bindBook(book: Book){
        currentBook = book
        binding.titleView.text = currentBook.title

        if(currentBook.subtitle == "")
            binding.subtitleView.visibility = View.GONE
        else
            binding.subtitleView.text = currentBook.subtitle

        var authorNameString = ""

        for(authorName in currentBook.author){
            authorNameString = "$authorNameString$authorName"
        }

        binding.authorView.text = authorNameString
    }

}

/*
Once upon a time in a magical forest, there was a pretty princess named Michelle, who was a beautiful princess waiting to be rescued. One
day, a prince named Petunia (yes he was a dude) showed up to her tower. She thought he was a villain coming to kidnap her, so she blew him
away with a bolt-action rifle and he died in the forest. No one ever came to rescue her again, and she died of starvation in her tower.
50 years later, gold became overvalued, and the rule of the goblins began. They monopolized the economy, enslaving the local dwarves to make
them tools and weapons. The ensuing war with the druids became the 2nd bloodiest conflict in the land, only beaten by the Great Blasting
of Raggerjoth. The aftermath of the war led to the creation of Women As Heroes, a coalition designed to institute more females as
warriors, since too many male heroes were dying in epic fashion on easy quests. The adventuring business blossomed shortly afterward, with
many new paths dotting the landscape, along with shops popping up along the roads. With dungeon exploration becoming more and more popular,
many wealthy barons and lords invested in making their own dungeons, luring adventurers in with wealthy rewards, trapping them and stealing
their gear to sell for a profit. This is where I come in.

Hi, my name's Lumbo, and I'm a mimic inside a vaulted room in the great Lord Spanchuck's dungeon! Here is my story.

I was born on a cold, dark day. My parents abandoned me and left me only with a single gold coin. However, I had a dream: to take my single
gold coin, go to the convenience store, buy a lottery ticket, and win big!

Unfortunately my plan didn't work out. The lottery ticket wasn't a winning one, and I fell into poverty. I was homeless and hungry. Then I died, but
since I'm a chest it didn't really matter. But later an adventurer came by and took my dead corpse, and used me as a backpack, and looking down on him
I was filled with the greatest amount of joy, because the look on his smile is priceless. Once he joined me in the afterlife, I told him that I have
been looking over him since then he tried to kill me, but it's all good because we are already dead, also I guess he can't understand me. Now we are best
buds so it's all good though.

However, he thought I was just a simple backpack, so when I started talking he freaked the beans out. He stabbed me with his sword but I was already
dead and also a chest so nothing happened. He ran away screeching like a child on an airplane and I kind of just walked away. Later, I met Hades and he
was like 'sup dude and I was like, "yo get me back to the land of the living dawg," and he was like, "no."

So I freakin' murdered his sorry sack and became the new king of the underworld, so I would say my life is pretty good right now.

Have you ever had a dream where you believed you could do anything, because I have a dream. That one day, little goblin boys and little goblin girls
will be able to join hands with little druid boys and druid girls as sisters and brothers. Then I realized it was a pointless dream and woke up.
I started that day and decided Hell needed a few changes. Eternal torment areas? BANG! Spas and masseuses. Fields of Elysium! Bang! Long queue for a
single roller coaster! And while I was at it, I put Benny the Skeleton in charge of Hell and revived myself.

Back alive in Lord Spanchuck's dungeon at last, doing my duties and being a good little mimic was all I ever wanted. But I was about to find out how much things had changed...

 */