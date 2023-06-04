package com.ydlclass.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author it楠老师
 * @createTime 2023-05-29
 */
@Data
@AllArgsConstructor
public class ChessPiece {

    private ChessUnit chessUnit;
    private Position position;

}
