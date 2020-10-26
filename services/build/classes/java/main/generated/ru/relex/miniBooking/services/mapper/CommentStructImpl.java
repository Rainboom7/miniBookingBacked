package ru.relex.miniBooking.services.mapper;

import java.util.Date;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.relex.miniBooking.bd.model.CommentModel;
import ru.relex.miniBooking.services.model.comment.Comment;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-26T14:56:34+0300",
    comments = "version: 1.4.0.Beta2, compiler: javac, environment: Java 12.0.1 (Oracle Corporation)"
)
@Component
public class CommentStructImpl implements CommentStruct {

    @Override
    public CommentModel toModel(Comment comment, String creator) {
        if ( comment == null && creator == null ) {
            return null;
        }

        CommentModel commentModel = new CommentModel();

        if ( comment != null ) {
            commentModel.setHotelId( comment.getHotelId() );
            commentModel.setTitle( comment.getTitle() );
            commentModel.setText( comment.getText() );
            commentModel.setCreatedAt( comment.getCreatedAt() );
            commentModel.setRating( comment.getRating() );
            commentModel.setId( comment.getId() );
        }
        if ( creator != null ) {
            commentModel.setCreatedBy( creator );
        }

        return commentModel;
    }

    @Override
    public Comment fromModel(CommentModel comment, long id, Date createdAt) {
        if ( comment == null && createdAt == null ) {
            return null;
        }

        Comment comment1 = new Comment();

        if ( comment != null ) {
            comment1.setHotelId( comment.getHotelId() );
            comment1.setTitle( comment.getTitle() );
            comment1.setCreatedBy( comment.getCreatedBy() );
            comment1.setText( comment.getText() );
            comment1.setRating( comment.getRating() );
        }
        if ( createdAt != null ) {
            comment1.setCreatedAt( createdAt );
        }
        comment1.setId( id );

        return comment1;
    }

    @Override
    public Comment fromModel(CommentModel comment) {
        if ( comment == null ) {
            return null;
        }

        Comment comment1 = new Comment();

        comment1.setHotelId( comment.getHotelId() );
        comment1.setTitle( comment.getTitle() );
        comment1.setCreatedBy( comment.getCreatedBy() );
        comment1.setText( comment.getText() );
        comment1.setId( comment.getId() );
        comment1.setCreatedAt( comment.getCreatedAt() );
        comment1.setRating( comment.getRating() );

        return comment1;
    }
}
