package com.moong.envers.approve.repo;

import com.moong.envers.applyForm.domain.ApplyForm;
import com.moong.envers.approve.domain.Approve;
import com.moong.envers.member.domain.Member;
import com.moong.envers.team.domain.Team;

import java.util.Collection;
import java.util.Set;

public interface ApproveRepositoryCustom {
    Set<Approve> findByMember(Member approveMember);

    Set<Approve> findByTeam(Team approveTeam);

    void changeApplyFormByApprove(Collection<Approve> approves, ApplyForm applyForm);

    void changeApplyFormByApprove(Approve approve, ApplyForm applyForm);
}

