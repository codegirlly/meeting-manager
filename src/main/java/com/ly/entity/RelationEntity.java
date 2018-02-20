package com.ly.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name="t_relation_join")
@Entity
@IdClass(RelationEntity.RelationPK.class)
public class RelationEntity {

    @Id
    private Integer meetingId;
    @Id
    private Integer userId;

    public Integer getmeetingId() {
        return meetingId;
    }

    public void setmeetingId(Integer meetingId) {
        this.meetingId = meetingId;
    }

    public Integer getuserId() {
        return userId;
    }

    public void setuserId(Integer userId) {
        this.userId = userId;
    }

    public static class RelationPK implements Serializable {

        private static final long serialVersionUID = -7189167162738318201L;
        @Column(length = 12, nullable = false)
        private Integer meetingId;
        @Column(length = 12, nullable = false)
        private Integer userId;

        public RelationPK() {
        }

        public RelationPK(Integer meetingId, Integer userId) {
            this.meetingId = meetingId;
            this.userId = userId;
        }


        public Integer getmeetingId() {
            return meetingId;
        }

        public void setmeetingId(Integer meetingId) {
            this.meetingId = meetingId;
        }

        public Integer getuserId() {
            return userId;
        }

        public void setuserId(Integer userId) {
            this.userId = userId;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((meetingId == null) ? 0 : meetingId.hashCode());
            result = prime * result + ((userId == null) ? 0 : userId.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            RelationPK other = (RelationPK) obj;
            if (meetingId == null) {
                if (other.meetingId != null)
                    return false;
            } else if (!meetingId.equals(other.meetingId))
                return false;
            if (userId == null) {
                if (other.userId != null)
                    return false;
            } else if (!userId.equals(other.userId))
                return false;
            return true;
        }
    }
}
