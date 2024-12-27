package pl.app.common.mapper;

public enum Join {
    LEFT, LEFT_INCLUSIVE,
    LEFT_EXCLUSIVE,
    RIGHT, RIGHT_INCLUSIVE,
    RIGHT_EXCLUSIVE,
    INNER,
    FULL, FULL_OUTER_INCLUSIVE,
    FULL_OUTER_EXCLUSIVE
}