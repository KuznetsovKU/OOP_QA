package org.example.HW2;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehavior, MarketBehavior{
    private final List<Actor> actorList = new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println("Customer " + actor.getName() + " entered the store.");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor: actors) {
            actorList.remove(actor);
            System.out.println("Customer " + actor.getName() + " has left the market");
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println("Customer " + actor.getName() + " joined the queue");
        actorList.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor: actorList) {
            if (! actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println("The store accepted the order from the customer: " + actor.getName());
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor: actorList) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println("The store gave the order to the customer: " + actor.getName());
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> actorsToLeave = new ArrayList<>();
        for (Actor actor: actorList) {
            if (actor.isTakeOrder()) {
                actorsToLeave.add(actor);
                System.out.println("Customer " + actor.getName() + " has left the queue");
            }
        }
        releaseFromMarket(actorsToLeave);
        actorsToLeave = null;
    }
}
