package com.didi.hummer.render.event.guesture;

import com.didi.hummer.render.event.base.Event;

import java.util.Map;

/**
 * 长按事件
 */
public class LongPressEvent extends Event {

    private Map<String, Float> position;

    public void setPosition(Map<String, Float> point) {
        this.position = point;
    }
}
