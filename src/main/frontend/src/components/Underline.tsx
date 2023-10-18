import gsap from 'gsap';
import React, {useEffect, useRef, ReactNode } from 'react';
import styled from 'styled-components';

interface Color {
    color: string;
}

interface UnderlineProps {
    children?: ReactNode;
    delay: number;
    color: string;
}

const UnderlineContainer = styled.span<Color>`
  background-image: linear-gradient(transparent 80%, ${props => props.color} 20%);
  background-size: 0% 100%;
  background-repeat: no-repeat;
  z-index: -1;
`;


const Underline = ({ delay, children, color }: UnderlineProps) => {
    const target = useRef(null);
    useEffect(() => {
        gsap.to(target.current, {
            scrollTrigger: {
                trigger: target.current,
                toggleActions: 'play none none none',
            },
            backgroundImage: `linear-gradient(transparent 80%, ${color} 20%)`,
            backgroundSize: '100% 100%',
            delay,
            duration: 0.6,
            ease: 'expo.out',
        });
    }, [delay, color]);
    return (
        <UnderlineContainer color={color} ref={target}>
            {children}
        </UnderlineContainer>
    );
};

export default Underline;