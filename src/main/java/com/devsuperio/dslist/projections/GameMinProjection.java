package com.devsuperio.dslist.projections;

public interface GameMinProjection {
	//pegar do select GameRepository
	Long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
